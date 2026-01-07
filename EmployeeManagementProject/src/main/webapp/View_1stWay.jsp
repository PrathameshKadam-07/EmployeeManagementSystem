<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var ="db" url="jdbc:oracle:thin:@localhost:1521:oracle" driver="oracle.jdbc.driver.OracleDriver" user="prathamesh" password="prathamesh"/>

<sql:query var="rs" dataSource="${db}">
select * from emp
</sql:query>


<table border="10" width = "100%">
<tr>
<th>Eid</th>
<th>Ename</th>
<th>Esal</th>
</tr>

<c:forEach var = "table" items="${rs.rows}">
<tr>
<td><c:out value= "${table.eid}"/></td>
<td><c:out value="${table.ename}"/></td>  
<td><c:out value="${table.esal}"/></td>  
</tr>

</c:forEach>
</table>

</body>
</html>