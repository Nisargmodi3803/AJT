<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>CORE_TAG</title>
</head>
<body>
<%--    set tag --%>
    <c:set var="n" value="66" scope="application"/>
<%--    out tag--%>
    <c:out value="${n}"/>
    <hr>
<%--   remove tag--%>
    <c:remove var="n"/>
    <c:out value="${n}">This is Remove tag</c:out>
    <hr>
<%--    If tag--%>
    <c:set var="name" value="Nisarg"/>
    <c:if test="${name.equalsIgnoreCase('Nisarg')}" >
        Yes!!! Name is Nisarg....
    </c:if>
<hr>

<%--    Choose,When & Otherwise tag--%>
    <c:set var="num" value="0"/>
    <c:choose>
        <c:when test="${num>0}">
            Number is positive
        </c:when>

        <c:when test="${num<0}">
            Number is negative
        </c:when>

        <c:otherwise>
            Number is equal to zero
        </c:otherwise>
    </c:choose>
<hr>
<%-- For-Each tag--%>
    <c:forEach var="i" begin="1" end="11">
        <c:out value="${i}"/>
    </c:forEach>
<hr>

<%--   Redirect tag--%>
<%--    <c:redirect url="https://www.google.com"/>--%>
    <c:url var="link" value="https://www.google.com">
        <c:param name="search" value="Mission Impossible Movies"/>
    </c:url>
    <c:out value="${link}"/>
<hr>
    <c:out value="${link}"/>

<hr>

<%-- Arithmetic Operations--%>
    <c:set var="n1" value="10"/>
    <c:set var="n2" value="20"/>
    <c:out value="${n1}+${n2} = ${n1+n2}"/>
    <br>
    <c:out value="${n1}-${n2} = ${n1-n2}"/>
    <br>
    <c:out value="${n1}*${n2} = ${n1*n2}"/>
    <br>
    <c:out value="${n2}/${n1} = ${n2/n1}"/>
<hr>
</body>
</html>