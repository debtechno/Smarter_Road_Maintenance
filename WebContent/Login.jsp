<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in page</title>
</head>
<body bgcolor="pink">
<h1><marquee>Welcome to smarter roads in Kolkata</marquee></h1>
<img width=40% src="file:///C:\MyProjects\Smarter_Road_Maintenance\Kolkata.jpg"></img>
<script>
function validateForm()
{
var x=document.forms["myForm"]["user"].value;
if (x==null || x=="")
  {
  alert("Username must be filled up");
  document.getElementById('un').focus();
  return false;
  }
var y=document.forms["myForm"]["password"].value;
if (y==null || y=="")
  {
  alert("password must be filled up");
  document.getElementById('pw').focus();
  return false;
  }
}</script>
<%--<%=session.getId()--%>
<br><br>
<form method="post" action="Login.do" name="myForm" onsubmit="return validateForm()">
<h2>Give your login details here:</h2>
User name:<input name="user" id="un" type="text">
<br>
Password:<input name="password" id="pw" type="password"><br><br>
<input type="reset" value="Cancel">

<input type="SUBMIT" value="Submit"> 
</form>
<br><br>
<a href="Registration.jsp">Not Registered yet?</a>
</body>
</html>