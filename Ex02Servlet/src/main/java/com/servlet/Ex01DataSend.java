package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex01DataSend")
public class Ex01DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//클라이언트의 요청정보를 담고 있는 객체 : request
		//데이터를 접근할 때 " request.getParameter(식별자)
		//문자열로 가져오기 때문에 연산할 경우 형변환 작업 필요
		String data = request.getParameter("data");
		
		System.out.println("클라이언트 요청이 들어옴...!");
		System.out.println("클라이언트 입력한값 : " + data);
		
		
		response.setContentType("text/html; charset=UTF-8");
		// [한글데이터를 전송하는 방법]
		// 클라이언트에게 HTML문서로 응답
		// 문자 인코딩 방식은 UTF-8
		PrintWriter out = response.getWriter();
		
		out.print(data);
	
	}

}
