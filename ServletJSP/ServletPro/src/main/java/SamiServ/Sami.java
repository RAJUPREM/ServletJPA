package SamiServ;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Sami implements Servlet{

	@Override
	public void destroy() {
		System.out.println("I am distroy");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("I am init");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("I am service");
		
		String name=req.getParameter("username");
		String pass=req.getParameter("pass");
		
		System.out.println(name);
		
		PrintWriter pr=res.getWriter();
		
		pr.print("<h1>I am missing user </h1>"+name);
		pr.print("<h1>I am missing pass </h1>"+pass);
		
	}

}
