<%--
    GMHKHome.jsp
    Created by Gongzi Muchang
    Date: 2020-02-18
    Time: 12:23 p.m.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>FindGACanada</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
    <div id="home-container">
        <jsp:include page="GMHKBanner.jsp" />
        <c:choose>
            <c:when test="${!empty(user.username)}">
                <h3 class="success-msg">Welcome, ${user.username}!</h3>
                <a href="<c:url value="/details?altCode=${user.lastGeoArea}" />">
                    View Last GeoArea You Visited
                </a>
            </c:when>
            <c:otherwise></c:otherwise>
        </c:choose>
        <h1>Find Geographic Area in Canada</h1>
        <h3>FindGACanada uses 2016 Canada Census Database for total population</h3>
        <form action="/level" method="get">
            <input type="submit" value="Search by Level"
                class="level-btn" />
        </form>
        <form action="/keyword" method="get">
            <input type="submit" value="Search by Keyword"
                class="keyword-btn" />
        </form>
        <jsp:include page="GMHKFooter.jsp" />
    </div>
</body>
</html>