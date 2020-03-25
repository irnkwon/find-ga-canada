<%--
    GMHKBanner.jsp
    Created by Gongzi Muchang
    Date: 2020-03-19
    Time: 5:05 p.m.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="banner-container">
    <div class="banner-menus">
        <a href="/home">Home</a>
        <a href="/level">Search by Level</a>
        <a href="/keyword">Search by Keyword</a>
        <c:choose>
            <c:when test="${!empty(user)}">
                <a href="/logout">Logout</a>
            </c:when>
            <c:otherwise>
                <a href="/login">Login</a>
            </c:otherwise>
        </c:choose>
    </div>
</div>
