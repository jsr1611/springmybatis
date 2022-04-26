<%--
  Created by IntelliJ IDEA.
  User: jimmy
  Date: 26.04.2022
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List of Employees</h1>

    <div>
        <table>
            <tr>
                <th>Full Name</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Hobbies</th>
                <th>Country</th>
                <th>Address</th>
            </tr>
            <c:forEach items="${listemployees}" var="e">
                <td>${e.fullname}</td>
                <td>${e.email}</td>
                <td>${e.gender}</td>
                <td>${e.hobbies}</td>
                <td>${e.country}</td>
                <td>${e.address}</td>

            </c:forEach>
        </table>
    </div>
</body>
</html>
