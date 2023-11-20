package SamiServ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondWay extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			System.out.println("I am service");
		
		String name=req.getParameter("username");
		String pass=req.getParameter("pass");
		
		System.out.println(name);
		res.setContentType("text/html");  
		PrintWriter pr=res.getWriter();
		
		pr.print("<h1>I am missing user </h1>"+name);
		pr.print("<h1>I am missing pass </h1>"+pass);
		
	}

}
