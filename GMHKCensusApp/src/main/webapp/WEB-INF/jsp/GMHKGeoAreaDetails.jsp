<%--
    GMHKGeoAreaDetails.jsp
    Created by Haeryun Kwon
    Date: 2020-02-18
    Time: 5:00 a.m.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <title>Geographic Area Details</title>
</head>
<body>
    <div id="auth-container">
        <jsp:include page="GMHKBanner.jsp" />
        <table cellpadding="10">
            <tr>
                <th><h2>Geographic Area Details</h2></th>
            </tr>
            <c:if test="${!empty(ages)}">
                <c:forEach var="age" items="${ages}">
                    <tr>
                        <td>${name}</td>
                    </tr>
                    <tr>
                        <td><strong>Geographic Area ID:</strong> ${geoAreaId}</td>
                    </tr>
                    <tr>
                        <td><strong>Code:</strong> ${code}</td>
                    </tr>
                    <tr>
                        <td><strong>Level:</strong> ${level}</td>
                    </tr>
                    <tr>
                        <td><strong>Alternative Code:</strong> ${altCode}</td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Total Population:</strong>
                            <fmt:formatNumber type="number"
                                value="${age.combined}"></fmt:formatNumber>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Male:</strong>
                            <fmt:formatNumber type="number"
                                value="${age.male}"></fmt:formatNumber>
                        </td>
                    </tr>
                    <tr>
                        <td><strong>Female:</strong>
                            <fmt:formatNumber type="number"
                                value="${age.female}"></fmt:formatNumber>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
        <jsp:include page="GMHKFooter.jsp" />
    </div>
</body>
</html>
