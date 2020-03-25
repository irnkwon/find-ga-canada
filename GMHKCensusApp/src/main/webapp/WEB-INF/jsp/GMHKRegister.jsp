<%--
    GMHKRegister.jsp
    Created by Gongzi Muchang
    Date: 2020-03-23
    Time: 12:07 a.m.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <title>Register</title>
</head>
<body>
<div id="auth-container">
    <jsp:include page="GMHKBanner.jsp" />
    <h1>Register</h1>
    <h3>Create your FindGACanada account</h3>
    <c:choose>
        <c:when test="${!empty(registerMsg)}">
            <h5 class="success-msg">${registerMsg}</h5>
        </c:when>
        <c:otherwise></c:otherwise>
    </c:choose>
    <form:form action="/register" method="post" class="auth-form" modelAttribute="newUser">
        <form:errors path="username" cssClass="error"/>
        <form:input type="text" placeholder="Username" class="auth-input" path="username" />
        <form:errors path="email" cssClass="error"/>
        <form:input type="email" placeholder="Email" class="auth-input" path="email" />
        <form:errors path="password" cssClass="error"/>
        <form:input type="text" placeholder="Password" class="auth-input" path="password" />
        <input type="submit" value="Create" class="search-btn" />
    </form:form>
    <div class="sign-up-wrapper">
        Already have an account?
        <a href="/login"><strong>Login now</strong></a>
    </div>
    <jsp:include page="GMHKFooter.jsp" />
</div>
</body>
</html>

