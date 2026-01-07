<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h1>All EMPLOYEE LIST</h1></center>

<table border="5" width = "100%">
<tr>
<th>Eid</th>
<th>Ename</th>
<th>Esal</th>
</tr>
<c:forEach var="table" items="${empList}">
<tr>
<td><c:out value= "${table.eno}"/></td>
<td><c:out value="${table.ename}"/></td>  
<td><c:out value="${table.esal}"/></td>  
</tr>
</c:forEach>
</body>
</html>