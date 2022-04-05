<%--
  Created by IntelliJ IDEA.
  User: ducphuong
  Date: 30/03/2022
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>


</head>
<body>
<h1>New Student </h1>
<hr/>
<form action="/students/saveOrUpdate" method="post">
    Student ID: <input type="text" name="studentId"/> <br/>
    Name: <input type="text" name="name" /><br/>
    <button>Save</button>
    <button formmethod="get" formaction="/students/list">List</button>
    <button formmethod="get" formaction="/students/search">Search</button>
</form>
</body>
</html>
