package com.demo.square;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class squareServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{ 
		PrintWriter out=res.getWriter();
		out.print("Hello to square!\n");
		
		int k= (int) req.getAttribute("k");
		out.print("Result sq: "+k*k);
	}
}
