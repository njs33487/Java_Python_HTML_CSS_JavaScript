package sessionservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.SuperVillain;

public class SessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("SESSION SERVLET: In my doGet method!!! ^_^");
		
		////////////LET'S SEE HOW TO CONTROL THE STATE OF OUR SERVER
		
		//GENERAL JAVA CODE
		SuperVillain dannyboy = 
				new SuperVillain("Danny Boy", "Technopath", 250_000);
				/*
				 * here, we're hard coding an object....BUT you can get an object from anywhere....
				 * for example you can get the object from the database...hint hint wink wink
				 */
		
		//SESSION CODE
		//this method will get the current session OR create one if there is no current session
		HttpSession session = req.getSession();

		//sidenote: if you wanted to check to see if a session existed without creating a session on accident
		//HttpSession session = req.getSession(false); //returns null if no session exists
		
		
		session.setAttribute("currentVillain", dannyboy);
			//you can set multiple attributes if you'd like; there is no theoretical limit
		
		//GENEERAL SERVLET CODE
		PrintWriter printer = resp.getWriter();
		printer.println("Danny Boy is on the loose......");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("SESSION SERVLET: In my doPost method!!! ^_^");
		
		////////////LET'S SEE HOW TO CONTROL THE STATE OF OUR SERVER
		

		String name = req.getParameter("myname");
		String superpower = req.getParameter("mysuperpower");
		int bounty = Integer.parseInt(req.getParameter("mybounty"));
		
		//GENERAL JAVA CODE
		SuperVillain tempVill =
				new SuperVillain(name, superpower, bounty);
		
		//SESSION CODE
		//this method will get the current session OR create one if there is no current session
		HttpSession session = req.getSession();
		
		session.setAttribute("currentVillain", tempVill);
		
		//GENERAL SERVLET CODE
		PrintWriter printer = resp.getWriter();
		printer.println(name+" is on the loose.....");
	}
}
