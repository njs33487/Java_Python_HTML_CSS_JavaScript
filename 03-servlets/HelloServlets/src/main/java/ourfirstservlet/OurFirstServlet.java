package ourfirstservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OurFirstServlet extends HttpServlet{


	//wait a minute.....WHO is calling my doGet()? Because I don't even have a main method....
	//			answer: tomcat      welcome to "inversion of control"
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws IOException, ServletException
	{
		System.out.println("in the doGet!!! yay!!!!");

		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL());
		System.out.println(req.getQueryString());
		


		/*
		 * let's see what a 400 status code looks like
		 * 
		 * The url to hit this servlet is "localhost:9002/HelloServlets/first"
		 * this url will lead to a 200 status code
		 * 
		 * 
		 * but let's try "localhost:9002/HelloServlets/bicycle", this will lead to
		 * a 404 status code
		 */
		
		//let me show you what a 500 status code looks like
//		throw new RuntimeException();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws IOException, ServletException
	{
		System.out.println("in the doPost!!!! yippie!!!");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}
	
	//and so on.....
	
}
