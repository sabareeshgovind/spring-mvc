<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<style>
.error{color:red}
</style>

<head>
<meta charset="UTF-8">
<title>Enter Teacher Info</title>
</head>
<body>

<form:form action = "processTeacher" modelAttribute="teacher">
First Name: <form:input path= "firstName"/>
<br/>
Last Name: <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br/>
Teacher Code: <form:input path="professorCode"/>
<form:errors path="professorCode" cssClass="error"/>
<br/>
No. of Classes: <form:input path="classes"/>
<form:errors path="classes" cssClass="error"/>
<br/>
Professor Login code: <form:input path="professorLoginCode"/>
<form:errors path="professorLoginCode" cssClass="error"/>
<br/>
<input type ="submit" value="Submit"/>
</form:form>
</body>
</html>