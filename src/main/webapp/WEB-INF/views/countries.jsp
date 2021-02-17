<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<html>
<head>
    <title>Countries</title>
</head>
<body>
<h1>Countries</h1>
<c:forEach items="${countries}" var="country">
    <p>${country.countryId} - ${country.countryName}</p>
</c:forEach>
</body>
</html>
