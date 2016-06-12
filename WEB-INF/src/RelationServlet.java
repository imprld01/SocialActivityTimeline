package com.web;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class RelationServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		RequestDispatcher view = null;
		DataAnalysis da = new DataAnalysis();
		String fn = (String)getServletContext().getAttribute("flare");	// get servlet context attribute for the flare.json file (add listener when start to set the attribute).
		String kwd = (String)request.getParameter("kwd");
		
		if(kwd != null){
			 ArrayList<Event> myEvents = da.whatIParticipateIn(kwd);
			 if(myEvents != null){
				 da.Relation2JsonFile(da.RelationJsonPacker(da.relationDistanceTable(kwd, myEvents)), fn);
				view = request.getRequestDispatcher("Relation.jsp");
			}
		}else view = request.getRequestDispatcher("index.jsp");
		
		view.forward(request, response);
	}
}