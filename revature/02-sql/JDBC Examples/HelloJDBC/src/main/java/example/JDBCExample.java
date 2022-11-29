package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import example.model.Pokemon;


/*
 * NOTE: JDBC's default is auto-commit
 * 
 * Common errors you may have to JDBC
 * 
 * 
 * "No suitable driver found"
 * the two common reasons why you'll see this are:
 *    -you forgot to add the dependency to your pom.xml file
 *    -your url has a typo
 */
public class JDBCExample {


	/*
	 * JDBC needs a SPECIFIC format to the URL string so that the DriverManager
	 * can understand WHICH driver you're asking to use.
	 * 
	 * For Postgresql, the URL format is:
	 * 		jdbc:postgresql://[endpoint:port]/[databasename]
	 * 
	 * For OracleSQL, the URL format is:
	 * 		jdbc:oracle:thin:@[endpoint/ip]:[port]:[dbname]
	 * 
	 */
//	private static String url=
//			"jdbc:postgresql://datachan.c4wt8faaxlgp.us-east-2.rds.amazonaws.com:5432/pokemonDB";
//	private static String username="datachan";
//	private static String password="p4ssw0rd";



	/////let's talk about environment variables now...and the PROPER way to deal with secret keys and passwords in a repo
	public static String url =
			"jdbc:postgresql://"+System.getenv("TRAINING_DB_ENDPOINT")+"/"+System.getenv("TRAINING_DB_DATABASENAME");
	public static String username = System.getenv("TRAINING_DB_USERNAME");
	public static String password = System.getenv("TRAINING_DB_PASSWORD");
	
	
	//////////MAIN METHOD
	public static void main(String[] args) {

//		statementExample(1050, "Space Monkey", "Fighting", "Ice");
//		preparedStatementExample(1051, "Christmas Monkey", "Fighting", "Fairy");
		
//		preparedStatementPrimaryKeyExample(-100, "Spooderman", "Insect", "TheStoryOfGirl");
		
		System.out.println(selectAllExample());
		


		System.out.println("end of program");
	}
	
	
	/////////////JDBC EXAMPLE METHODS///////////////////////////
	
	
	/**
	 *  SELECT ALL EXAMPLE
	 *  This method will demo a select from a database using JDBC, we happen to be using
	 *  a PreparedStatement object to do this, BUT you could use a regular statement object as well
	 *  
	 *  @exception NullPointerException if you're a jerk, mane
	 */
	public static List<Pokemon> selectAllExample() {
		
		List<Pokemon> pokes = new ArrayList<>();
		
		try(Connection conn = DriverManager.getConnection(url, username, password)) {

			//SELECT * FROM pokemon;
			//SELECT * FROM pokemon ORDER BY pokemon_name;
			String ourSQLStatement = "SELECT * FROM pokemon";
			
			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);
			
			ResultSet resultSet = ps.executeQuery(); //NOTE...this is NOT "executeUpdate" it's "executeQuery"
			
			/*
			 * Here, we're going to extra the data from the ResultSet object.
			 * 
			 * The resultSet object contains TWO things. First, it contains the records retrieved from the database. Second,
			 * 		it remembers which row of the resultSet you're currently looking at. The row it remembers starts at index -1.
			 * 
			 * "resultSet.next()" asks the resultSet object to go to the next record in the resultSet (adding 1 to the index) and if
			 * that record does NOT exist it will result the boolean false. If the next record DOES exist it will result the boolean
			 * true.
			 */
			while(resultSet.next()) {
				//							resultSet.getInt(columnIndex)
				Pokemon newPokemon = new Pokemon(resultSet.getInt(1), resultSet.getString(2)
											, resultSet.getString(3), resultSet.getString("pokemon_secondtype"));
				
				pokes.add(newPokemon);
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return pokes;
	}
	
	
	
	
	/**
	 *  PREPARED STATEMENT EXAMPLE
	 *  This method will demo an insert into a database using JDBC, but this time with a PreparedStatement
	 *  object
	 */
	public static void preparedStatementExample(int p_id, String p_name, String p_type, String p_typetwo) {
		
		try(Connection conn = DriverManager.getConnection(url, username, password)) {
			

						//you may also hardcode values into your sql string if you'd like
			///for example "INSERT INTO pokemon VALUES(DEFAULT,?,?,'normal')"
			///for example "INSERT INTO pokemon VALUES(15 ,?,?, null)"
			//INSERT INTO pokemon values(121, 'starmie','water','psychic');
			String ourSQLStatement = "INSERT INTO pokemon VALUES(?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);
			ps.setInt(1, p_id);//the 1st "?"
			ps.setString(2, p_name); //the 2nd "?"
			ps.setString(3, p_type); //the 3rd "?"
			ps.setString(4, p_typetwo); //the 4th "?"
			
			ps.executeUpdate();
			

			/*
			 * Prepared Statements are precompiled. Because of this the prepared
			 * statement will guard against sql injection AND it is faster
			 * 
			 * ALSO, you can hardcode values into your sql statement
			 * 
			 * String sql = "INSERT INTO pokemon VALUES(null,?,'normal',?)";
			 * 	NOW there are only two "?"s...indices 1 and 2
			 */
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	 
	
	/**
	 *  STATEMENT EXAMPLE
	 *  This method will demo an insert into a database using JDBC
	 */
	public static void statementExample(int p_id, String p_name, String p_type, String p_typetwo) {

        /*
         * try with resources automatically closes a resource when it is done
         *   being used (after the try block).
         * The try with resources uses a set of parenthesis after the "try" keyword
         *   the parenthesis only accepts an object that is of type "AutoClosable"
         *   or a descendant of AutoClosable
         */
		
//		try(Object obj = new Object()){
		try(Connection conn = DriverManager.getConnection(url, username, password)) {
			
			//INSERT INTO pokemon values(121, 'starmie','water','psychic');
			String ourSQLStatement =
					"INSERT INTO pokemon VALUES("+p_id+", '"+p_name+"','"+p_type+"','"+p_typetwo+"')";
			

			/*
			 * Is there anything stopping me from making p_typetow equal:
			 * 
			 * p_typetwo =  "'); DROP TABLE pokemon;";
			 * 
			 * 
			 * SQL Injection.
			 * This is where a user can type in valid sql syntax that will be passed to your database then executed.
			 */
			
			Statement statement = conn.createStatement();
			
			int numOfRowsEffect = 
					statement.executeUpdate(ourSQLStatement);
			
			System.out.println("The # of rows effected: "+ numOfRowsEffect);
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		///////////BELOW IS AN EXAMPLE OF CODE WITHOUT "TRY WITH RESOURCES"
//		Connection conn = null;
//		
//		try {
//			conn = DriverManager.getConnection(url, username, password);
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	
	
	
	///////////////////////////



	////PREPARED STATEMENT W/ PK return
	public static void preparedStatementPrimaryKeyExample(int p_id, String p_name, String p_type, String p_typetwo) {
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			String sql = "INSERT INTO pokemon values(DEFAULT, ?,?, null)";
			
															//necessary to return the PK
			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, p_name); //the 1st "?"
			ps.setString(2, p_type); //the 2nd "?"
//			ps.setString(3, p_typetwo); //the 3rd "?"
			
			ps.executeUpdate(); //THIS line is what sends the information to the DB
			
			//this section is necessary to return the PK of the inserted record
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next()) {
				System.out.println("the returned PK: "+rs.getInt("pokemon_id"));
			}
			//////
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
