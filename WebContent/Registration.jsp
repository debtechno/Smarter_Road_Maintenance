<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<title>Registration</title>
</head>
<body bgcolor="lightyellow">
<center><h1>Registration Page</h1></center>
	<center>
	<form action="register" method="post" >
		<input type="hidden" name="type" value="form1" />
		<div></div>
		
						<td align="right">UserName:</td>
						<td><input type="text" name="UserName" /></td>
					
				
						<td align="right">Password:</td>
					 	<td><input type="Password" name="Password" /></td>
					
					
						<td align="right">Role:</td>
						
							<select name="Role">
								<option value="Select">--Select--</option>
								<option value="Citizen">Citizen</option>
								<option value="Kmc">KMC</option>
								<option value="Kmda">KMDA</option>
								<option value="Pwd">PWD</option>
							</select>
					
					 <colspan="2" align="right"><input type="submit" name="button1" value="Register" />

					
				

		</form>
	</center>
</body>
</html>