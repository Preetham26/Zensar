package com.ubereats.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ubereats.entity.UberEats;
import com.ubereats.service.UberEatsService;
import com.ubereats.service.UberEatsServiceInterface;
/**
 * Servlet implementation class GlobalServlet
 */
public class GlobalServlet extends HttpServlet 
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		String option = request.getParameter("ac");
		if(option.equals("register3"))
		{
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			UberEats ue = new UberEats();
			ue.setName(name);
			ue.setEmail(email);
			ue.setPassword(pass);
			UberEatsServiceInterface us = UberEatsService.createServiceObject();
			int i = us.createProfile(ue);
			if(i>0)
			{
				out.println("profile is created");
			}
			else
			{
				out.println("profile is not created");
			}
		}
		if(option.equals("login"))
		{
	    }
		if(option.equals("timeline"))
		{
		}
		out.println("</body></html>");
		}
			}



