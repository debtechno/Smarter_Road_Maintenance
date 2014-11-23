<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@page import="com.ibm.beans.UserBean" %>--%>
<%@page import="java.sql.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
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
var y=document.forms["myForm"]["NewComplain"].value;
if (y==null || y=="")
  {
  alert("Complain field must be filled up");
  document.getElementById('compl').focus();
  return false;
  }
  var z=document.forms["myForm"]["severity"].value;
  if(z==null||z=="")
	  {
	  alert("Severity field must be filled up");
	  document.getElementById('sev').focus();
	  return false;
	  }
}
</script>
<center><h1>Welcome to your Profile</h1>

<form action="Citizen.do" method="post" name="myForm" onsubmit="return validateForm()">
<table>
<tr><td>User name:</td><td><input type="text" name="user_name" id="un"></td></tr>
<tr><td>Complain Summary:</td><td><input type="text" name="summary" id="sm"></td></tr>
<tr><td align="right">New Complain:</td>
						<td><textarea name="NewComplain" id="compl"></textarea></td></tr>
				<tr><td>Severity:</td><td><input type="text" name="severity" id="sev"></td></tr>	
				<tr><td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Cancel"></td></tr> 
</table>
</form>			
<br/></br>

<form action="Citizen">
<input type="hidden" name="type" value="ViewComplain"> 
<input type="submit" value="View Complain" size=""> </form><br/>
<form action="Citizen">
<input type="hidden" name="type" value="EditComplain"> 
<input type="submit" value="Edit Complain" size=""> </form><br/>

<form action="Citizen">
<input type="hidden" name="type" value="Status"> 
<input type="submit" value="Check Status" size=""> 
<br><br><form action="Logout.jsp"><input type="submit" value="Logout"></form>
</form><br>
</center>
</body>
</html>