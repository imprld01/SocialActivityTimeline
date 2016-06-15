package com.web;

import com.web.*;
import com.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ApplyServlet extends HttpServlet{

    public void doGet(HttpServletRequest request,
						HttpServletResponse response)
			throws IOException, ServletException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String applierName = request.getAttribute("name");
			String applierGrade = request.getAttribute("grade");
			String applierNumber = request.getAttribute("number");
			String applierSex = (String)request.getAttribute("sex");
			ApplyProcess apply = new ApplyProcess();
			Applicant applicant  = new Appliant(applierName, applierGrade, applierNumber, applierSex);
			
			apply.WriteApplier(applicant);
			
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		    view.forward(request,response);
			}
}