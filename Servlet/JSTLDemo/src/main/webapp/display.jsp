<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body >
<h1><%

	String name = request.getAttribute("name").toString();
	out.println(name);

%></h1>

and we can print this name using expression language like this <h5> ${name} </h5> 
 this phenomenon is called JSTL EL= Expression language<br>
 this not only fetches value from only request but can also fetch from session,cookie,session 
 
 <c:out value="Hello world from Taglib"></c:out>
 <%
 /*
 <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/javatraing" user="root" password="root" />                  
 <sql:query var="rs" dataSource="${db}">select * from Trainers</sql:query>

 <c:forEach items="${rs.rows}" var="item"  >
 
 <c:out value="${item.PersonId}"></c:out> : <c:out value="${item.LastName}"></c:out> : <c:out value="${item.FirstName}"></c:out> : <c:out value="${item.Address}"></c:out> : <c:out value="${item.City}"></c:out>  
 </c:forEach>
 
 */
 %>
<c:set var="str" value="Suraj is srjRed"></c:set>
<br>
${str} <br>
Length : ${fn:length(str)}

<c:forEach items="${fn:split(str,'r')}" var="word" >

<br>
${word}

</c:forEach>
<br>
index of srj is : ${fn:indexOf(str,'srj')}
<br>

<c:if test="${fn:contains(str,'is')}">
	java is good
</c:if>



</body>
</html>