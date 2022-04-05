<%--
  Created by IntelliJ IDEA.
  User: ducphuong
  Date: 30/03/2022
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student Detail</h1>
<hr/>
<h3>Student Id: ${studentId}</h3>
<h3>Name : ${name}</h3>
<p>
    <a href="/students/edit/${studentId}">Edit Student</a>
</p>
<hr/>
<a href="/">Home</a>
</body>
</html>
