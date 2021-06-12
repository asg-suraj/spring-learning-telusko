
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@  include file="info.jsp" %>
<%@ page errorPage="error.jsp" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Square Result JSP page</title>
</head>
<body bgcolor="cyan">

	<%!
		//This is called Declration and this will type outside service method but in that Same Class
		int dec = 4;
		Date show(){
			Date d = new Date();
			return d;
		}
		
		/* <%@ *percentSymbolInsteadOfthisWord*> this tag is for importing package as shown above 
		This is also called Directive
		
		*/
	%>

	<% 
	//this are called scriplet tag
	//due to this brackets we can directly write code in Service method 
	//Every JSP will create Servlet after compilation and by this brackett we are simply accessing that Service(doPost/doGet) method
		int number1 = Integer.parseInt(request.getParameter("number1"));
				//request is implicit object for jsp
		int number2 = Integer.parseInt(request.getParameter("number2"));
		int sum = number1+number2;

		out.println("Today's Date: "+ show());
		out.println("<br>Output: "+sum);
		out.println("<br>Square of Sum: "+sum * sum);
		// int p = sum/0; //if this is Uncommented we will be redirected to error.jsp 
	 %>
	<br> The variables can also be printed- <%=dec%> -Like this and This is called Expression
</body>
</html>