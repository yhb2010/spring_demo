<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<title></title>
	</head>
	<body>
		<h1><s:message code="hello" /></h1>
		<a href="<c:url value='/version4/spittles' />">Spittles</a>
		<a href="<c:url value='/version4/spitter/register' />">Register</a>
	</body>
</html>
