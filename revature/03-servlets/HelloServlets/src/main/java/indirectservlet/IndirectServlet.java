package indirectservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * There are THREE WAYS a servlet can respond to an incoming request:
 * (another way I could word the question: what types of actions can I take inside of a servlet?)
 * 
 * -Direct Response		(we use the PrintWriter object)
 * 	This happens when the servlet directly reponds to the client by itself
 * 			(it doesn't need any other resource's help)
 * 
 * -Forward		(1req,1res. Uses RequestDispatcher's .forward() to function)
 * >comes from the HttpServletRequest object.
 * >The servlet asks another servlet/resource (internal to the server) to assist with the response
 * 
 * -Redirect	(2req,2res. Uses Response object's .sendRedirect() to function)
 * >comes from the HttpServletResponse object.
 * >The servlet informs the client that it must go somewhere else to have the request handled
 * 
 */
public class IndirectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("INDIRECT SERVLET: In my doGet method!!! ^_^");
		
		////////////LET'S SEE HOW TO INDIRECTLY SERVICE A REQUEST
		

		//Premise: what if a single servlet doesn't have all the functionality it needs to do the job?
		//	is there anything you can do in that situation?
		
		//A portion of the request can be resolved HERE
		

		//And then later you can send the user elsewhere for remainder of the resolution
		resp.sendRedirect("http://localhost:9002/HelloServlets/direct");
//			resp.sendRedirect("http://localhost:9002/HelloServlets/resources/html/secondPage.html");
//		resp.sendRedirect("https://www.google.com/");
		
		

		//REDIRECT
		

		//TWO http requests, TWO http responses
		//client is totally AWARE of the new resource/entity
		
		//this is similar to calling the customer service department of a department store, looking for the toy department
		//and then the customer service rep gives you the toy dep # to call yourself.
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("INDIRECT SERVLET: In my doPost method!!! ^_^");

		////////////LET'S SEE HOW TO INDIRECTLY SERVICE A REQUEST

		//Premise: what if a single servlet doesn't have all the functionality it needs to do the job?
		//	is there anything you can do in that situation?
		
		//A portion of the request can be resolved HERE


		//And then later you can send the user elsewhere for remainder of the resolution
		RequestDispatcher redis = req.getRequestDispatcher("/direct");
//		RequestDispatcher redis = req.getRequestDispatcher("/resources/html/secondPage.html");
		

		//note: forwarding does NOT work for resources external to this server
//		RequestDispatcher redis = req.getRequestDispatcher("https://www.google.com/");
		
		redis.forward(req, resp);
		
		


		//FORWARD

		//ONE http request, ONE http response
		//client is totally UNAWARE of the new resource/entity
		
		//this is similar to calling the customer service department of a department store, looking for the toy department
		//and then the customer service rep transfer your call while you stay on the line.
	
	}
}
