<%--
  Created by IntelliJ IDEA.
  User: ducphuong
  Date: 30/03/2022
  Time: 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit</h1>
<hr/>
<form action="/students/update" method="post">
    Student ID: <input type="text" name="studentId" value="${student.studentId}"/> <br/>
    Name: <input type="text" name="name" value="${student.name}"/><br/>
    <button>Update</button>
    <button formmethod="get" formaction="/students/list">List</button>
    <button formmethod="get" formaction="/students/search">Search</button>
</form>
</body>
</html>
