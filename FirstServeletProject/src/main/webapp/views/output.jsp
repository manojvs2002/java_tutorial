<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home||output</title>
</head>
<body>
	this is the output jsp page
	<br/>
	My fullName is
	<b><%= request.getAttribute("fullname") %></b>
	
	
	<p>
	My Full name accessed through a variable =>
	<%
	String myname = (String)request.getAttribute("fullname");
	out.println(myname);
	%>
	</p>
	
	
	
	<p>
	<%
	
		for(int i=1;i<=5;i++){
			out.print("<u>Value of i at index "+i+"= "+(i*10)+"<br/></u>");
		}
		
	%>
	</p>

</body>
</html>