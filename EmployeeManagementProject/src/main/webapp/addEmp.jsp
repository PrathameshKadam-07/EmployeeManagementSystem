<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
</head>
<body>
    <h2>Add Employee</h2>
    <form action="./addServlets" method="get">
        Employee No:<input type="text" name="eno" required><br><br>
        Employee Name:<input type="text" name="ename" required><br><br>
        Employee Salary<input type="text" name="esal" required><br><br>

        <input type="submit" value="Add Employee"><br><br>
        <a href="./home.jsp">Home</a>
    </form>
</body>
</html>
