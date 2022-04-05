<%@ page import="cg.wbd.grandemonstration.service.CustomerService" %>
<%@ page import="cg.wbd.grandemonstration.service.CustomerServiceFactory" %>
<%@ page import="cg.wbd.grandemonstration.model.Customer" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form action="/customers" method="post">
    <fieldset>
        <legend>Customer Information</legend>

        <caption>Customers List</caption>
        <table>

            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <input type="text" name ="id" value="${requestScope["customer"].getId()}">
                </td>
                <td>
                    <input type="text" name="name" value="${requestScope["customer"].getName()}">
                </td>
                <td>
                    <input type="text" name="email" value="${requestScope["customer"].getEmail()}">
                </td>
                <td>
                    <input type="text" name="address" value="${requestScope["customer"].getAddress()}">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Update">
                </td>
            </tr>
            </tbody>
        </table>
    </fieldset>
</form>
<a href="/customers">Back to list</a>.