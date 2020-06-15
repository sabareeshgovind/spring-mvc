<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>
<!--  
First Name : ${first}
<br/>
Last Name : ${last}
<br/>
-->
Full Name: ${student.firstName} ${student.lastName}
<br/>
Country: ${student.country}
<br/>
Favorite Course: ${student.favCourse}
<br/>
Operating Systems: <ul>
<c:forEach  var="temp" items="${student.operatingSystems}">
<li>${temp}</li>
</c:forEach>
</ul>
</body>
</html>