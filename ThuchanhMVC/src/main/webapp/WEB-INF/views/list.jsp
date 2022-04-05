<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ducphuong
  Date: 29/03/2022
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<style>
    table {
        border: 1px solid #000;
    }
    th, td {
        border: 1px dotted #555;
    }
</style>
<%--<%--%>
<%--    List<cg.wbd.grandemonstration.model.Customer> customers = (List<cg.wbd.grandemonstration.model.Customer>) request.getAttribute("customers");--%>
<%--%>--%>
There are ${requestScope.customers.size()} customer(s) in list.
<form action="/customers" method="get">
<table >
    <caption>Customers List</caption>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${requestScope.customers}">
        <tr>
            <td>
                <c:out value="${c.id}"/>
            </td>
            <td>
                <a href="info.jsp?id=${c.id}">${c.getName()}</a>
            </td>
            <td>
                <c:out value="${c.email}"/>
            </td>
            <td>
                <c:out value="${c.address}"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</form>