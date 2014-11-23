<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--<%@page import="model.UserBean" %>--%>
<%@page import="java.sql.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
<center><h1>Welcome to your Profile</h1>
</br></br></br>
	<form action="register" method="post" >
		<input type="hidden" name="type" value="form1" />
		<div></div>
		<tr>
	
						<input type="hidden" name="type" value="ViewComplain"> 
<input type="submit" value="View Complain" size="">
					
						<td align="right">Status:</td>
						</tr>
						<tr>
						<td>
							<select name="Status">
								<option value="Select">--Select--</option>
								<option value="Inprogress">INPROGRESS</option>
								<option value="Completed">COMPLETED</option>
								<option value="UnderReview">UNDER REVIEW</option>
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right"><input type="submit" name="button1" value="Submit" /></td>

					</tr>
					</table>
</br>
</br>
</br>


<form action="Citizen">

<tr><td >Comment:</td>
						<td><textarea name="Comment"></textarea></td></tr>	
				<tr><td align="right"><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Cancel"></td></tr> 
				
<br><input type="button" action="Logout.jsp" value="Logout"></a>
</form>			
<br>
</center>
</body>
</html>