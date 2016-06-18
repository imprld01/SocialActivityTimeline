package com.web;


import com.model.*;
import com.model.EventProcess;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EventInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
			throws IOException, ServletException { 
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				EventProcess ep = (EventProcess) getServletContext().getAttribute("event");
				ArrayList<Event>eList = ep.getEventList();
				if(eList==null){System.out.println(">>EventInfoServlet eList is null");}
				String action = (String)request.getParameter("action");//check if top10
				//test action
				System.out.println(">>EventInfoServlet action = \""+action+"\"");
				//test context
				//System.out.println(">>EventInfoServlet eList[0] name = \""+eList.get(0).getName()+"\"");
				
				DataAnalysis da = new DataAnalysis();
				
				/****find top 10****/
				if(action.equals("top10")){
					ArrayList<Event> top10= new ArrayList<Event>();
					top10 = da.getHitRatio(eList);
					request.setAttribute("top10",top10);
					RequestDispatcher view = request.getRequestDispatcher("top10.jsp");
					view.forward(request,response); //next web
				}
				else{
					
				/****send event information ****/
					int id = (int)request.getAttribute("id");//get id of redirect event
					Event event = eList.get(id);
					request.setAttribute("event",event);
				/****update CTR****/
					int  t= eList.get(id).getCTR();
					t++;
					eList.get(id).setCTR(t);//CTR++
					getServletContext().setAttribute("event",eList);//update CTR
					
				/****send the number of participatants ****/
					request.setAttribute("participatants",(int)eList.get(id).getApplicantList().size());
				
				/****send the sex ratio ****/
					
					int[] ratio = da.getSexRatio(eList.get(id).getApplicantList());
					request.setAttribute("sexRatio",ratio);
				
				
					RequestDispatcher view = request.getRequestDispatcher("eventInfo.jsp");
					view.forward(request,response); //next web
				}
			}
}