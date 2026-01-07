<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Operation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .navbar {
            background-color: #f2f2f2;
            padding: 10px;
        }
        .navbar a {
            margin: 0 15px;
            text-decoration: none;
            color: #333;
            font-weight: bold;
        }
        .navbar a:hover {
            color: #007BFF;
        }
        .body-links {
            margin-top: 30px;
        }
        .body-links a {
            display: block;
            margin: 10px 0;
            text-decoration: none;
            color: #444;
            font-size: 18px;
        }
        .body-links a:hover {
            color: #007BFF;
        }
    </style>
</head>
<body>
    <h1>Employee Master</h1>
    <p>Choose an option below:</p>

    <div class="body-links">
        <a href="./addEmp.jsp">➕ Add Employee</a>
        <a href="./editEmp.jsp">✏️ Edit Employee</a>
        <a href="./searchEmp.jsp">🔍 Search Employee</a>
        <a href="./displayEmp.jsp">📋 Display All Employees</a>
    </div>
</body>
</html>