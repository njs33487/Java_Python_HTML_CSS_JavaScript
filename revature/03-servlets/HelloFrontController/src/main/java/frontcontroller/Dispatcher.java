package frontcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.AppleController;
import controller.HomeController;
import controller.LoginController;
import controller.PepperController;

public class Dispatcher {
	
	public static void myVirtualRouterMethod(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("\n\n\tIN OUR DISPATCHER ( myVirtualRouter() )");

		System.out.println("Current URL: "+ req.getRequestURL());
		System.out.println("Current URI: "+ req.getRequestURI());
		
		switch(req.getRequestURI()) {
			case "/HelloFrontController/json/applej":
				System.out.println("case 1");
				AppleController.appleFinder(req, resp);
				break;
			case "/HelloFrontController/json/pepperj":
				System.out.println("case 2");
				PepperController.pepperFinder(req, resp);
				break;
			case "/HelloFrontController/login":
				System.out.println("case 3");
				LoginController.loginDirectResponseJson(req, resp);
//				LoginController.loginDirectResponseQueryParams(req, resp);
				break;
			case "/HelloFrontController/login/current":
				System.out.println("case 4");
				LoginController.checkCurrentUser(req, resp);
				break;
			case "/HelloFrontController/login/logout":
				System.out.println("case 5");
				LoginController.logout(req, resp);
				break;
			case "/HelloFrontController/login/loginwithhtml":
				System.out.println("case 6");
				LoginController.loginForwardResponse(req, resp);
				break;
			case "/HelloFrontController/forwarding/home":
				System.out.println("case 7");
				HomeController.home(req, resp);
				break;
			default:
				System.out.println("In the default case: Dude, you gave me a bad URL");
				break;
		}
	}

}
