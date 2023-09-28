<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 26-09-2023
  Time: 09:51 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Random" %>
<%@include file="header.jsp"%>
<html>
<head>
    <title>JSP Directive</title>
    <style>
        *{
            margin: 0px;
            padding: 0px;
        }
    </style>
</head>
<body>
    <h1>Random Number :
      <%! int n;%>
      <%
          Random r = new Random();
          n = r.nextInt(10);
      %>
      <%=n%>
    </h1>
</body>
</html>
