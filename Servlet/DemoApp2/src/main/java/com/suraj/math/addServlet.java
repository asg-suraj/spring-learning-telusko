package com.suraj.math;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")   //this is called annotation and hence don't need to write in web.xml
public class addServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int number1 = Integer.parseInt(req.getParameter("number1"));
		int number2 = Integer.parseInt(req.getParameter("number2"));
		int sum = number1+number2;
		
		Cookie cookie = new Cookie("sum",sum+"");
		resp.addCookie(cookie);
		resp.sendRedirect("sqr");
		
	}
}
