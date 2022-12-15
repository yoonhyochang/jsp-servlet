package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/print")
public class Ex01Print extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, 
							HttpServletResponse response) throws ServletException, IOException {
		// 유저에게 데이터를 전송해줄 때 : PrintWriter(통로)
		// 데이터를 전송할수 있는 통로 생성 : response.getWriter();
//		데이터 전송:out.print()
		PrintWriter out = response.getWriter();
		
		out.print("Hello Servlet!");
	}

}
