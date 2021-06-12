package com.suraj.math;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;

@WebServlet("/sqr")
public class sqrServlet extends HttpServlet {
	
	public void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		int sum=0;
		Cookie[] cookies = req.getCookies();
		
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("sum")) {
				sum =Integer.parseInt(cookie.getValue());
			}
		} 
		PrintWriter out = resp.getWriter();

		//now we try adding Html anround this output
		out.println("<html><body bgcolor='pink'>"); //but this is very tough as we see, so do this in JSP
		out.println("sum is "+sum);
		out.println("Square of given sum is "+sum * sum);
		out.println("</body></html>");
		
	};
}
