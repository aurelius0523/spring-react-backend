<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload file</title>
</head>
<body>
	<form:form method="post" action="/uploadFile" modelAttribute="accountVM">
		<input type="file" name="file" />
		
		<input type="submit" value="Upload file" />
		<form:input path="shouldShowHeader" />
	</form:form>
	<br /> ${message }
	<br />
	<br />
	<form method="GET" action="${uploadFileUrl}">
		<input type="submit" value="Reset" />
	</form>
</body>
</html>