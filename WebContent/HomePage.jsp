<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.util.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your options</title>
</head>
<body>
<%
List Styles=(List)request.getAttribute("Styles");
Iterator it=Styles.iterator();
out.print("<br>What do you want to do? <br>");
while(it.hasNext()){
	out.print(it.next()+"<br>");	
	}
%>
</body>
</html>