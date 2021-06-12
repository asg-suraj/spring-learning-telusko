package com.suraj.math;
//please check another project to see how annotaion works and it then do not require web.xml and after ServletConfig in Telusko playlist there is nothing here
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class SqrServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req /* request */, HttpServletResponse resp /* response */) throws ServletException, IOException {
//			PrintWriter out = resp.getWriter();
//			int sum=(int) req.getAttribute("sum");
//			out.println("Sum is: "+sum);
//			int sqr = sum * sum;
//			out.println("Square of given Sum "+ sqr);
			System.out.println("second servlet");
			
			//sum is sent via  link which is more like paramter
//			int sum=Integer.parseInt(req.getParameter("sum"));
//			PrintWriter out = resp.getWriter();
//			out.println("Sum is: "+sum);
//			int sqr = sum * sum;
//			out.println("Square of given Sum "+ sqr);
			
			
//			HttpSession session = req.getSession(); //get session object
//			int sum = (int)session.getAttribute("sum"); //fetching value of sum
//			PrintWriter out = resp.getWriter();
//			out.println("Sum is: "+sum);
//			int sqr = sum * sum;
//			out.println("Square of given Sum "+ sqr);
			int sum=0;
			Cookie cookies[] = req.getCookies(); //get cookie and get variable
			
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("sum")) {
					sum= Integer.parseInt(cookie.getValue());
				}
			}
			
			PrintWriter out = resp.getWriter();
			out.println("Sum is: "+sum);
			int sqr = sum * sum;
			out.println("Square of given Sum "+ sqr);
			
			//use ServletContext for printing my name
			ServletContext ctx = getServletContext(); //This is the object which is shared by all the servlets
			String str = ctx.getInitParameter("name" ); //check web.xml find context-param 
			out.println("My name is "+str);
			
			//use ServletConfig for printing my name (Servlet specific)
			ServletConfig cg = getServletConfig(); //This is the object which is shared by all but this particular needs different so use config
			String strD = cg.getInitParameter("name" ); //check web.xml find init-param in SqrServlet
			out.println("My name by ServletConfig is "+strD);
		}
}
