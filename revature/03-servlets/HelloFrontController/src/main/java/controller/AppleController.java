package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.SuperVillain;

public class AppleController {
	
	public static void appleFinder(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		/*
		 * THIS IS WHERE YOU'D GO TO THE DATABASE TO GET THE OBJECTS TO SEND TO THE CLIENT
		 */
		
		SuperVillain apple = new SuperVillain("Apple Jupiter", "Flesh Fruit", 110_000);
			//so HERE you'd call the service layer which will call the dao layer which
			//	will get the villain from the database...you generally don't hardcode your data
		

		resp.setContentType("application/json");
		PrintWriter printer = resp.getWriter();
		printer.write(new ObjectMapper().writeValueAsString(apple));
	}
}
