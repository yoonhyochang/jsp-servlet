
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/makeMultable")
public class makeMultable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String color = request.getParameter("color");
		
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		out.print("<table border=1 bgcolor =" + color + ">");

		for (int i = num1; i <= num2; i++) {
			out.print("<tr>");
			for (int j = 1; j <= 9; j++) {
				out.print("<td>" + i + "*" + j + "=" + i * j + "</td>");
			}
			out.print("</tr>");
		}
		out.print("</table>");
	}

}
