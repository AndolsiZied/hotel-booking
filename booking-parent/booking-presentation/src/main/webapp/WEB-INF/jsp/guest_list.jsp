<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<body>
<h1><spring:message code="guest.list"/></h1>
<ul>
    <c:forEach items="${guests}" var="guest">
        <li>
            <c:out value="${guest.getId()}"/>
        </li>
    </c:forEach>
</ul>

</body>
</html>