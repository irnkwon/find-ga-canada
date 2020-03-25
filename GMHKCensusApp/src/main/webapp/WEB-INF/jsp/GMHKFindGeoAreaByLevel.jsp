<%--
    GMHKFindGeoAreaByLevel.jsp
    Created by Haeryun Kwon
    Date: 2020-02-18
    Time: 4:24 a.m.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <title>Search by Level</title>
</head>
<body>
    <div id="level-container">
        <jsp:include page="GMHKBanner.jsp" />
        <h1>Search Geographic Area by Level</h1>
        <h3>Please search only for level 0, 1, or 2</h3>
        <form action="/findByLevel" method="get">
            <input type="number" min="0" max="2" name="level"
                value="" class="level-input" required/>
            <input type="submit" value="Search" class="search-btn" />
        </form>

        <table cellpadding="10">
            <tr>
                <th>Geo Area ID</th>
                <th>Code</th>
                <th>Level</th>
                <th>Name</th>
                <th>Alt Code</th>
            </tr>
            <c:if test="${!empty(geoAreas)}">
                <c:forEach var="geoArea" items="${geoAreas}">
                    <tr>
                        <td>${geoArea.geographicAreaID}</td>
                        <td>${geoArea.code}</td>
                        <td>${geoArea.level}</td>
                        <td>
                            <a href="<c:url value="/details?altCode=${geoArea.alternativeCode}" />">
                                ${geoArea.name}
                            </a>
                        </td>
                        <td>${geoArea.alternativeCode}</td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
        <jsp:include page="GMHKFooter.jsp" />
    </div>
</body>
</html>
