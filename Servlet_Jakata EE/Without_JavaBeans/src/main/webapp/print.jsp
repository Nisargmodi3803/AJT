<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 28-09-2023
  Time: 11:08 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.example.without_javabeans.Student" %>
<html>
<head>
    <title>print</title>
</head>
<body>
    <%
        Student stud = (Student) request.getAttribute("stud");
        int id = stud.getId();
        String name = stud.getName();
    %>

    <h1>
        ID : <%=id%><br><br>
        Name : <%=name%>
    </h1>
</body>
</html>
