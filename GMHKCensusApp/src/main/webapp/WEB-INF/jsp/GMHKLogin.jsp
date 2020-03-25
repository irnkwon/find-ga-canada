<%--
    GMHKLogin.jsp
    Created by Gongzi Muchang
    Date: 2020-03-22
    Time: 11:18 p.m.
--%>
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
        <form action="/findByKeyword" method="get" class="auth-form">
            <input type="email" placeholder="Email" class="auth-input" />
            <input type="password" placeholder="Password" class="auth-input" />
            <input type="submit" value="Sign in" class="search-btn" />
        </form>
        <div class="sign-up-wrapper">
            New to FindGACanada? <a href="/register"><strong>Register now</strong></a>
        </div>
        <jsp:include page="GMHKFooter.jsp" />
    </div>
</body>
</html>
