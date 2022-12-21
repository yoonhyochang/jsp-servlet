

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex05userinfo")
public class Ex05userinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String rpw = request.getParameter("password_check");
	String  gender = request.getParameter("gender");
	String blood_type = request.getParameter("blood_type");
	String datetime_local = request.getParameter("datetime_local");
	String [] hobby = request.getParameterValues("hobby");
	String color = request.getParameter("color");
	String textarea = request.getParameter("textarea");
//	응당할 페이지에 대한 출력
	response.setContentType("text/html; charset= utf-8");
	PrintWriter out = response.getWriter();
	out.println("id :"+ id+"<br>");
	out.println("password :"+ password+"<br>");
	out.println("rpw :"+ rpw+"<br>");
	out.println("gender :"+ gender+"<br>");
	out.println("blood :"+ blood_type+"<br>");
	out.println("birth :"+ datetime_local+"<br>");
//	취미는 여러개의 값을 가지고옴 ->getParameterValues()
	out.print("sport :");
	for(int i  =0 ;i< hobby.length;i++) {
	out.print(hobby[i] +" ");
	}
	out.print("<br>");
	out.println("color :"+ color+"<br>");
	out.println("talk :"+ textarea);
		
	}

}
