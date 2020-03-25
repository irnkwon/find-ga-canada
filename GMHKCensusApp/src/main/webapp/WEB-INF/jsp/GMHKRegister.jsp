<%--
    GMHKRegister.jsp
    Created by Gongzi Muchang
    Date: 2020-03-23
    Time: 12:07 a.m.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <form action="/findByKeyword" method="get" class="auth-form">
        <input type="text" placeholder="Username" class="auth-input" />
        <input type="email" placeholder="Email" class="auth-input" />
        <input type="text" placeholder="Password" class="auth-input" />
        <input type="submit" value="Create" class="search-btn" />
    </form>
    <div class="sign-up-wrapper">
        Already have an account?
        <a href="/login"><strong>Login now</strong></a>
    </div>
    <jsp:include page="GMHKFooter.jsp" />
</div>
</body>
</html>

