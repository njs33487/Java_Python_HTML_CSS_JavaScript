package userinputservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.MyCustomStatusMessage;
import model.SuperVillain;

public class UserInputServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("USER INPUT SERVLET: In my doGet method!!! ^_^");
		
		////////////LET'S SEE HOW TO RECEIVE A FORM FIELD DATA FROM THE USER
		//				NOTICE THE QUERY PARAMETERS IN THE URL ITSELF
		
		String username = req.getParameter("myUsername");
		String password = req.getParameter("myPassword");
		
		System.out.println("Extracted Username: "+ username);
		System.out.println("Extracted Password: "+ password);
		

		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL());
		System.out.println(req.getQueryString());
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("USER INPUT SERVLET: In my doPost method!!! ^_^");
		
		////////////LET'S SEE HOW TO RECEIVE A FORM FIELD DATA FROM THE USER
		
		String username = req.getParameter("myUsername");
		String password = req.getParameter("myPassword");
		
		System.out.println("Extracted Username: "+ username);
		System.out.println("Extracted Password: "+ password);
		

		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL());
		System.out.println(req.getQueryString());
		
	}
	
	
	
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("USER INPUT SERVLET: In my doPut method!!! ^_^");
		
		////////////LET'S SEE HOW TO RECEIVE A JSON FROM THE USER
		
		//let's interpret a JSON from the user
		ObjectMapper mapper = new ObjectMapper();
									//			input stream		the class we'd like to cast to
		SuperVillain myVill = mapper.readValue(req.getInputStream(), SuperVillain.class);
		
		//we'll print the JSON so we can see if the read was successful with our human eyes
		System.out.println(myVill);
		
		//let's send a response for fun sake, it's NOT necessary to read a json from the user though
		resp.setContentType("application/json");
		
		MyCustomStatusMessage myMessage  = new MyCustomStatusMessage("Villain Received", "And Contained");
		resp.getWriter().write(new ObjectMapper().writeValueAsString(myMessage));
		
	}
	
	

}
