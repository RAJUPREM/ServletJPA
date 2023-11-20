package SamiServ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdWay extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pr=resp.getWriter();
		
		RequestDispatcher rd=req.getRequestDispatcher("/secondway");
		rd.forward(req, resp);
		rd.include(req, resp);
		
		resp.setContentType("text/html");  
		
		pr.print("<h1>I am doGet </h1>");
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");  
		PrintWriter pr=resp.getWriter();
		
		pr.print("<h1>I am doPost </h1>");
	
	}

	
	

}
