<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h2>注册新用户</h2>

	<sf:form commandName="customer" method="post">
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
			
		<b>电话: </b>
		<sf:input path="phoneNumber" />
		<br />
		<b>姓名: </b>
		<sf:input path="name" />
		<br />
		<b>地址: </b>
		<sf:input path="address" />
		<br />
		<b>城市: </b>
		<sf:input path="city" />
		<br />
		<b>州: </b>
		<sf:input path="state" />
		<br />
		<b>邮编: </b>
		<sf:input path="zipCode" />
		<br />
		<input type="submit" name="_eventId_submit" value="Submit" />
		<input type="submit" name="_eventId_cancel" value="Cancel" />
	</sf:form>
</body>
</html>