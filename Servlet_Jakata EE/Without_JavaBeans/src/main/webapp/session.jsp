<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 28-09-2023
  Time: 11:03 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.example.without_javabeans.Student" %>
<html>
<head>
    <title>session</title>
</head>
<body>
      <%
          Student stud = new Student();
          stud.setId(Integer.parseInt(request.getParameter("ID")));
          stud.setName(request.getParameter("Name"));

          request.setAttribute("stud",stud);

          RequestDispatcher requestDispatcher = request.getRequestDispatcher("print.jsp");
          requestDispatcher.forward(request,response);
      %>
</body>
</html>
