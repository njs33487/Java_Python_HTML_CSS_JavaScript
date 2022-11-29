package frontcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="MasterServlet", urlPatterns = {"/master/*","/json/*",
						"/forwarding/*", "/redirecting/*", "/login/*", "/admin/*", "/api/v2/pokemon/*"})
public class MasterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("IN OUR MASTER SERVLET: doGet");
		
		Dispatcher.myVirtualRouterMethod(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("IN OUR MASTER SERVLET: doPost");
		
		doGet(req, resp);
	}
}
