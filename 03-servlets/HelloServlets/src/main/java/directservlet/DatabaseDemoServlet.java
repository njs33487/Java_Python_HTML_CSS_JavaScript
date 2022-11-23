package directservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.SuperVillain;

public class DatabaseDemoServlet extends HttpServlet {



	//////////////////////////////////////////////////////////////////////////////////////////////////
		//					FULL JDBC CONNECTION WITH YOUR SERVLETS
		//					(normally you would do this in the dao layer, not in your servlet layer)
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	/////let's talk about environment variables now...and the PROPER way to deal with secret keys and passwords in a repo
	
	
	public static String url = "jdbc:postgresql://"+System.getenv("TRAINING_DB_ENDPOINT")+
			"/superhumanDB";
	public static String username = System.getenv("TRAINING_DB_USERNAME");
	public static String password = System.getenv("TRAINING_DB_PASSWORD");
	
	


	//IF YOU WANT TO USE JDBC WITH A WAR PROJECT YOU NEED TO DO THE FOLLOWING:
	static { //(this would normally go into your dao layer)
	      try {
	          Class.forName("org.postgresql.Driver");
	      }catch(ClassNotFoundException e) {
	          e.printStackTrace();
	          System.out.println("Static block has failed me");
	      }
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		/*
		 * I AM GOING TO SKIP THE SERVICE LAYER AND DAO LAYER for the sake of
		 * simplicity. In your project you're NOT ALLOWED to skip these layers.
		 * 
		 * So instead of doing the full jdbc try-catch block here...you'd simply call the service
		 * layer.
		 */
		
		
		
		SuperVillain myVill = null;
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			String sql= "SELECT A.shuman_name , C.spower_name , A.bounty "// <--the space is important
					+ "FROM superhumans A "
					+ "INNER JOIN shuman_spower_junction B "
					+ "ON A.shuman_id = B.my_shuman_id "
					+ "INNER JOIN superpowers C "
					+ "ON C.spower_id = B.my_spower_id "
					+ "WHERE A.shuman_name = 'Danny Boy' "
					+ "ORDER BY C.spower_name ;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) { //extra the data from the resultset
				myVill = new SuperVillain(rs.getString(1), rs.getString(2), rs.getInt(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//////////BACK TO REGULAR SERVLET LOGIC!!!
		resp.setContentType("application/json");
		PrintWriter printer = resp.getWriter();
		printer.write(new ObjectMapper().writeValueAsString(myVill));
		
	}
	
}
