package com.web;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class RelationServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		RequestDispatcher view = null;
		DataAnalysis da = new DataAnalysis();
		String kwd = (String)request.getParameter("kwd");
		
		if(kwd != null){
			da.Relation2JsonFile(da.RelationJsonPacker(da.relationDistanceTable(kwd, da.whatIParticipateIn(kwd))));
			view = request.getRequestDispatcher("Relation.jsp");
		}else view = request.getRequestDispatcher("index.jsp");
		
		view.forward(request, response);
	}
}