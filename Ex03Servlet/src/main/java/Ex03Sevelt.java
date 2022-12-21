

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// url mapping : servlet 클래스를 대신하는 문자열
// 시용이유1. 클래스 경로가 노출되기 때문에 보안상의 문제
// 시용이유2. 클래스 경로가 길면 불편
// 다룬 servlet 의 url mapping값과 중복불가**
@WebServlet("/helloweb")
public class Ex03Sevelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		색 깔 데이터 받아와서 해당 페이지 배경색바꾸기
//		변경 버튼을 누르는 것! -> 요청을 하는 행위
//		따라서 데이터는 요청 객체 , 즉 request 객체에서 가져와야한다.
		
		String bg = request.getParameter("color");
	
		// 해당 페이지 색 변경
//		응답할 페이지에 대한 설정
		
		response.setContentType("text/html; charset= utf-8");
//		응답할 출력스트림
		
		
		PrintWriter out = response.getWriter();
		
//		out.print("<body bgcolor ="+ bg +"></body>");
//		out.print("<body style='background-color :"+ bg +"'></body>");
		out.print("<style> body{background-color :"+ bg +"}</style>");
	}

}
