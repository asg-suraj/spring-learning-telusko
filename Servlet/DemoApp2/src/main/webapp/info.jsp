<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>info about Tags</title>
</head>
<body>
<% 

/*
This JSP is Just to write this comment

JSP Directive
@page
@include
@taglib

<%@ page attribute="value" attribute="value" '%'> '%' here inverted commas should ignore in actual
there are sevreal attributes like language="" and extends=" " and import =" " and session="", autoFlush,contentType,errorPage, isErrorPage, info, isELIgnored, isThreadSafe


Practical implementation of JSP Directive : page, include, taglib


There are different tags in JSP 
- Scriplet
- Directive
- Declaration

Directive tag has 3 types : 
- @page -:import page, specify lang, specofy for entire page,handle exception or not
- @include -: add another page
- @taglib -: tags and lib of tag can use external tags


@page : 
- it is used to import page, specify language, handle exception or specify any specific settings for entire page
- example of @page 
- syntax of @page
- attributes of @page type of JSP directive

@include :
- it is used to add another page
- example of @include
- importance of include tag
- syntax of @include 
- attributes of @include

@taglib :
- it is used to include tags and library of tag. We can also use external tags.
- example of @taglib
- why to use it
- syntax of @taglib
- attributes of @taglib


 





*/

%>
<%= 7+6 + " this output is from info.jsp<br>" %>
<% 
/*
Implicit Objects in JSP

. Request(HttpServletRequest), Response, PageContext, out(PrintWriter) , Session, Application(Context), Config
This objects are automatically instatiated


*/
/*
Exception handelling in JSP


*/

%>
</body>
</html>