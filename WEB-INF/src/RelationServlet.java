package com.web;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class RelationServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		RequestDispatcher view = null;
		String pwd = (String)request.getParameter("pwd");
		
		String checkResult = ap.pwdCheck(pwd);
		if(!checkResult.equals("0000"))
			view = request.getRequestDispatcher("PostForm.jsp");
		else view = request.getRequestDispatcher("Error.jsp");
		
		view.forward(request, response);
	}
}