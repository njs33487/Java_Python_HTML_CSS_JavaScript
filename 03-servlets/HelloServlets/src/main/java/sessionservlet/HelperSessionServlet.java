package sessionservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.SuperVillain;

public class HelperSessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("HELPER SESSION SERVLET: In my doGet method!!! ^_^");
		
		////////////LET'S SEE HOW TO CONTROL THE STATE OF OUR SERVER
		
		//SESSION CODE
		HttpSession session = req.getSession();
		SuperVillain villain=
				(SuperVillain)session.getAttribute("currentVillain");

		//sidenote: if you wanted to check to see if a session existed without creating a session on accident
		//HttpSession session = req.getSession(false); //returns null if no session exists
		
		

		//GENERAL SERVLET CODE
		PrintWriter printer = resp.getWriter();
		printer.println("<html><body>");
		
		if(villain != null) {
			printer.println("We've captured the villain!!!");
			printer.println("<h1>Villain name: "+villain.getName()+"</h1><br>");
			printer.println("<b>\tSuperpower: "+villain.getSuperpower()+"</b><br>");
			printer.println("<i>\tBounty: $"+villain.getBounty()+"</i>");
		}else {
			printer.println("Can't find any villains........");
		}
		
		printer.println("</body></html>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("HELPER SESSION SERVLET: In my doPost method!!! ^_^");
		
		////////////LET'S SEE HOW TO CONTROL THE STATE OF OUR SERVER
		
		//SESSION CODE
		HttpSession session = req.getSession();
		
		//THIS METHOD WILL DESTROY THE SESSION FOR THIS USER
		//you'll more than likely use this for your logout functionality
		session.invalidate();
		
	}
}
