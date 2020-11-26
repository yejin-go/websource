package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/HelloServlet" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post방식에서 한글 안깨지게 보완하기
		request.setCharacterEncoding("utf-8");
		//사용자가 보낸 값 가져오기
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		
		//사용자가 보낸 값 확인하기 => 화면으로 출력하기
		response.setContentType("text/html;charset=utf-8"); /*한글 안깨지게 하는 법*/
		PrintWriter out = response.getWriter();	
		out.print("<html><head><title>결과값 확인</title></head>");
		out.print("<body><h2>결과값 확인하기</h2>");
		out.print("<ul><li>username : "+username+"</li>");
		out.print("<li>age : "+age+"</li>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
