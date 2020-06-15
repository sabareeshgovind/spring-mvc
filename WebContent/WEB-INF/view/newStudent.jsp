<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Student Info</title>
</head>
<body>

<form:form action = "processStudent" modelAttribute="student">
First Name: <form:input path= "firstName"/>
<br/>
Last Name: <form:input path="lastName"/>
<br/>
Country: <form:select path= "country" >
<form:option value= "Brazil" label= "Brazil"/>
<form:option value= "India" label= "India"/>
<form:option value= "France" label= "France"/>
</form:select>
<br/>
Java: <form:radiobutton path="favCourse" value="Java"/>
C#: <form:radiobutton path="favCourse" value="C#"/>
Ruby: <form:radiobutton path="favCourse" value="Ruby"/>
Python: <form:radiobutton path="favCourse" value="Python"/>
<br/>
Operating Systems:
Linux <form:checkbox path= "operatingSystems" value= "Linux"/>
MacOS <form:checkbox path= "operatingSystems" value= "MacOS"/>
Windows <form:checkbox path= "operatingSystems" value= "Windows"/>
<br/>
<input type ="submit" value="Submit"/>
</form:form>


</body>
</html>