<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Employee</title>
</head>
<body>
    <h2>Edit Employee</h2>
    <form action="./editServlet" method="get">
        Employee No:<input type="text" name="eno" required><br><br>
        Employee Name:<input type="text" name="ename" required><br><br>
        New Salary:<input type="text" name="esal" required><br><br>

        <input type="submit" value="Update Employee">
    </form>
</body>
</html>
