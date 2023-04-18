package com.demo.add;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class addServlet extends HttpServlet{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
    	int i= Integer.parseInt(req.getParameter("num1"));
    	int j= Integer.parseInt(req.getParameter("num2"));
    	int k=i+j;
    	
//    	PrintWriter out= res.getWriter();
//    	out.print("Result : "+k);
    	
    
//		String name=req.getParameter("name");
//		String sname=req.getParameter("sname");
//		
//    	PrintWriter out= res.getWriter();
//    	out.print("My name is : "+name+" "+sname);
    	
    	req.setAttribute("k", k);
    	
    	RequestDispatcher rd=req.getRequestDispatcher("sq");
    	rd.forward(req, res);
		
		
    }
}
