<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<div>
		<h3>配送警告</h3>
	</div>

	<p>您的地址超出配送范围，请自己取</p>

	<!-- flowExecutionUrl：它包含了流程的url，将一个_eventId参数关联到url上，以便返回到web流程时触发accept事件 -->
	<a href="${flowExecutionUrl}&_eventId=accept">继续</a> |
	<a href="${flowExecutionUrl}&_eventId=cancel">放弃</a>
</body>
</html>