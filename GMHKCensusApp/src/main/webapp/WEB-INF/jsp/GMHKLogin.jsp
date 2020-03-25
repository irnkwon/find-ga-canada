<%--
    GMHKLogin.jsp
    Created by Gongzi Muchang
    Date: 2020-03-22
    Time: 11:18 p.m.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <title>Login</title>
</head>
<body>
    <div id="auth-container">
        <jsp:include page="GMHKBanner.jsp" />
        <h1>Login</h1>
        <h3>Sign in with your FindGACanada email</h3>
        <form:form action="/login" method="post" class="auth-form" modelAttribute="login">
            <form:input type="email" placeholder="Email" class="auth-input" path="email" />
            <form:input type="password" placeholder="Password" class="auth-input" path="password" />
            <input type="submit" value="Sign in" class="search-btn" />
        </form:form>
        <div class="sign-up-wrapper">
            New to FindGACanada? <a href="/register"><strong>Register now</strong></a>
        </div>
        <jsp:include page="GMHKFooter.jsp" />
    </div>
</body>
</html>
