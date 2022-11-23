package example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OurCustomConnectionFactory {

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
	
	
	
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

}
