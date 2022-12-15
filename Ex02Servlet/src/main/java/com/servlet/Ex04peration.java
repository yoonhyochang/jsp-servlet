package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04peration")
public class Ex04peration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		int data3 = Integer.parseInt(data1);
		int data4 = Integer.parseInt(data2);
		String c = request.getParameter("c");
		
		
		PrintWriter out = response.getWriter();
		if(c.equals("*")){
			out.print(data3+ c +data4+"="+(data3*data4));
		}
		else if(c.equals("+")) {
			out.print(data3+ c +data4+"="+(data3+data4));
		}
		else if(c.equals("-")) {
			out.print(data3+ c +data4+"="+(data3-data4));
		}
		else if(c.equals("/")) {
			out.print(data3+ c +data4+"="+(data3/data4));
		}else {}
		
		
	}

}
