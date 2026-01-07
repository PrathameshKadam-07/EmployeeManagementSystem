<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Employee</title>
</head>
<body>
    <h2>Search Employee</h2>
    <form action="./searchServlet" method="get">
        Employee No:<input type="text" name="eno" required><br><br>
        <input type="submit" value="Search">
    </form>
</body>
</html>
