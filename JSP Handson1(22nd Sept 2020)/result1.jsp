<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.pack.Employee"></jsp:useBean> 
<jsp:setProperty property="*" name="emp"/> 
Employee Details<br> 
<jsp:getProperty name="emp" property="code" /><br> 
<jsp:getProperty name="emp" property="name" /><br> 
<jsp:getProperty name="emp" property="salary" /><br>


</body>
</html>