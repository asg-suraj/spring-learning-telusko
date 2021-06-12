package com.suraj.math;
//please check another project to see how annotaion works and it then do not require web.xml and after ServletConfig in Telusko playlist there is nothing here

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class AddNumbersServlet extends HttpServlet {
	//This class Adds two numbers from index.html and share result
	
	@Override
	public void /* service */ doGet(HttpServletRequest req /* request */, HttpServletResponse resp /* response */) throws ServletException, IOException {
		//service Method uses get method by default so we have been provided with doPost to use post method we also have doGet method
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int sum= num1+num2;
//		This is an implementation of redirect through RequestDispatacher But we have another method that is sendRedirect()
//		//Now we need Sqaure of the given sum in another servlet and we do this using RequestDispatcher or Redirect below we use RequestDispatcher 
//		req.setAttribute("sum", sum); //here we are assigning one attribute with request object so that the next servlet can use
//		RequestDispatcher rd = req.getRequestDispatcher("/sqr");
//		rd.forward(req, resp); //this forwards request and response object
		
//		System.out.println(sum); //it prints Data On Console
//		PrintWriter out = resp.getWriter(); // resp.getWriter() return PrintWriter Object
//		out.println("result is: "+sum);
		
//		Use of sendRedirect
//		resp.sendRedirect("sqr?sum="+sum); //the value can be passed to URL via this because it uses GET method 
//		//sendRedirect tells client to go to sqr?sum=valueOfSum
		
		
//      session object is created by tommcat only we just need a hold on that
//		HttpSession session = req.getSession(); //now we get hold in session object
//		session.setAttribute("sum", sum); //now we are attaching sum attribute with session 
//		resp.sendRedirect("sqr");
//		
		
//		use of cookie to send the data
		Cookie cookie = new Cookie("sum",sum+""); //because it needs string so we append like this
		resp.addCookie(cookie);
		resp.sendRedirect("sqr");
		
		
		
		
	}
}
