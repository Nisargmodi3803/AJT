<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 13-09-2023
  Time: 11:12 am
  To change this template use File | Settings | File Templates.
--%>
<%!
    int count=0;
%>

<%
    if(session.getAttribute("ctn")==null)
    {
        count=0;
    }
    ++count;
   session.setAttribute("ctn",count);

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
<h1>You visited : <%=count%> times</h1>
</body>
</html>
