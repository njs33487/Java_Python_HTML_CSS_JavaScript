package directservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.SuperVillain;

public class DirectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException
	{
		System.out.println("DIRECT SERVLET: In my doGet method!!! ^_^");
		
		
		resp.setContentType("text/html");
		/*
		 * What is the PrintWriter object?
		 * 	It's an object that originals from the HttpServletResponse, used to DIRECTLY
		 * 	response to the client.
		 */
		PrintWriter printer = resp.getWriter();
		printer.println("<html><body><h2>HELLO FROM MY DIRECT SERVLET!!!</h2></body></html>");

		//LET'S PREPARE A RESPONSE STATUS CODE
		resp.setStatus(418);
//		resp.setStatus(491);//what happens if you send a status code that doesn't exist?
				//Well, it sends the status code anyway

		
//		resp.setStatus(HttpServletResponse.SC_CREATED);
//		resp.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
	}
	

	/*
	 * NOTE: I am NOT using proper convention for the HTTP methods; for example, my doPost is NOT
	 * creating a resource. Im just utilizing each method to show a new feature ( my purpose isn't
	 * to demo the http method convention, we've already talked about that)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException
	{
		System.out.println("DIRECT SERVLET: In my doPost method!!! ^_^");
		
		////////////LET'S SEE HOW TO SEND A JSON (SINGULAR OBJECT) USING SERVLETS
		
		/*
		 * NORMALLY, would we be hardcoding this data? NO! 
		 * We'd actually call the service layer, which calls the dao layer, which
		 * gets the data from the database
		 * 
		 * this line is core java...is have NOTHING new from servlets
		 */
		SuperVillain asura = new SuperVillain("Asura", "Hair Armament", 200_000);
		
		//the "new ObjectMapper()" stuff is jackson databind
		//	note, Jackson databind is NOTHING to do with servlets, it's a general technology
		String myJSON = new ObjectMapper().writeValueAsString(asura);
		System.out.println("Here is the string version of my Asura object: "+ myJSON);
		
		//SERVLET CODE SECTION
		//actual servlet logic starts here
		resp.setContentType("application/json");
		
		PrintWriter printer = resp.getWriter();
		printer.write(myJSON);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("DIRECT SERVLET: In my doPut method!!! ^_^");
		
		////////////LET'S SEE HOW TO SEND A JSON (ARRAY) USING SERVLETS
		
		/*
		 * NORMALLY, would we be hardcoding this data? NO! 
		 * We'd actually call the service layer, which calls the dao layer, which
		 * gets the data from the database
		 * 
		 * this line is core java...is have NOTHING new from servlets
		 */
		List<SuperVillain> myVillList = new ArrayList<SuperVillain>();

		myVillList.add(new SuperVillain("Billy", "Time Dilation", 225_000));
		myVillList.add(new SuperVillain("Saix", "Twister", 250_000));
		myVillList.add(new SuperVillain("Titan", "Raw Power", 300_000));
		
		//the "new ObjectMapper()" stuff is jackson databind
		//	note, Jackson databind is NOTHING to do with servlets, it's a general technology
		String myJSON = new ObjectMapper().writeValueAsString(myVillList);
		System.out.println("Here is the string version of my ArrayList object: "+ myJSON);
		
		//SERVLET CODE SECTION
		//actual servlet logic starts here
		resp.setContentType("application/json");
		
		PrintWriter printer = resp.getWriter();
		printer.write(myJSON);
	}
	
}
