

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		request.setCharacterEncoding("utf-8");
		
		
		//결과 내용을 한글 깨짐없이 사용하는 언어셋 세팅
		response.setcharacterEncvoding("utf-8");
		response.setContentType("text/html");
		
		String mid = request.getParameter("mid");
		String mpass = request.getparameter("mpass");
		
		//printWriter : javascript 를 핸들링
		PrintWriter pw =response.gerWriter();
		
		//response.getWriter()		: 현재 페이지에 문자로 출력
		
		if(mid.equals("hong") && mpass.equals("a123456")){
			
			pw.write("<script>"
					+"alert('정상적으로 로그인 하셨습니다.');"
			+ "</script>");
			
		}
		else {
			pw.write("<script>"
					+"alert('아이디 및 패스워드를 다시 확인 하세요');"
					+"location.href="
					);
			
		}
		
		System.out.println(mid);
		System.out.println(mpass);
		
		
		
		
	}

	
	
	
	
	
	
}



