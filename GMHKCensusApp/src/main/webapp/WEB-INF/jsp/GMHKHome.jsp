<%--
    GMHKHome.jsp
    Created by Gongzi Muchang
    Date: 2020-02-18
    Time: 12:23 p.m.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FindGACanada</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
    <div id="home-container">
        <jsp:include page="GMHKBanner.jsp" />
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
