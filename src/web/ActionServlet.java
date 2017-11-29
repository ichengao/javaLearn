package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ActionServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String uri=request.getRequestURI();
		String action=uri.substring(uri.lastIndexOf("/")+1,uri.lastIndexOf("."));
		
		HttpSession session=request.getSession();
		System.out.println(session.getId());
		
//		session过期时间
//		session.setMaxInactiveInterval(10);
		
		if(action.equals("login")){
			String name=request.getParameter("username");
			String pwd=request.getParameter("password");
			String number=request.getParameter("vcode");
			String code=session.getAttribute("code").toString();
			if(name.equals("123") && pwd.equals("123") && number.equals(code)){
				session.setAttribute("uname", name);
				response.sendRedirect("index.jsp");
			}else{
				request.setAttribute("msg", "用户名活密码错误");
				request.getRequestDispatcher("login.jsp")
				.forward(request, response);
			}
		}else if(action.equals("logout")){
			session.invalidate();
			response.sendRedirect("login.jsp");
		}
		
	}
}
