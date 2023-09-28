<%--
  Created by IntelliJ IDEA.
  User: Nisarg Modi
  Date: 23-09-2023
  Time: 03:16 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP</title>
</head>
<body>
    <%!
        int a=50;
        int b=10;
        String str = "Nisarg Modi";

        int doSum()
        {
            return (a+b);
        }

        StringBuffer doreverse()
        {
            StringBuffer sb = new StringBuffer(str);
            return sb.reverse();
        }
    %>

    <%
        out.print("Sum = "+(doSum()));
        out.print("<br>");
        out.print("Str = "+str);
        out.print("<br>");
        out.print("Reverse of String : "+doreverse());
        out.print("<br>");
    %>

    <h1>Sum = <%=doSum()%></h1>
    <h1>Str = <%=str%></h1>
    <h1>Reverse of String = <%=doreverse()%></h1>
</body>
</html>
