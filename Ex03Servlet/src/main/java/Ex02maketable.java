

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02maketable")
public class Ex02maketable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		사용자가 지정한 방의 갯수를 받아와서 테이블 형태로 출력
//		6개의 방을 테이블 사용해서 만들어서 출력
//		for문사용
		
//		방의갯수 받아오기
		String room = request.getParameter("room");
		int room1 = Integer.parseInt(room);
		response.setContentType("text/html; charset= utf-8");
		
		PrintWriter out = response.getWriter();
//		1 행 6열 -> tr 1개 , td가 6개
		
		
		out.print("<table border=1>");
		out.print("<tr>");
		for(int i =1; i<=room1;i++) {
			
		out.print("<td>"+i+"</td>");}
		out.print("<tr>");
		
		out.print("</table>");
		
		
		
	}

}
