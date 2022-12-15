package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Plus")
public class Ex03Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		
		response.setContentType("text/html; charset=UTF-8");
		//문자열 -> 정수로 변환
		int data3 = Integer.parseInt(data1);
		int data4 = Integer.parseInt(data2);
		
		PrintWriter out = response.getWriter();
		out.print(data3+"+"+data4+"="+(data3 + data4));
	
	}

}
