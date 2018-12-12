<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<div>
		<h3>欢迎来到pizza店</h3>
	</div>

	<sf:form>
		<!-- flowExecutionKey（流程执行键）：当流程进入视图状态后，流程暂停并等待用户行为，当用户提交表单时，流程执行键会在_flowExecutionKey输入域中返回并在流程暂停的位置进行恢复 -->
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />

		输入您的电话号码：<input type="text" name="phoneNumber" />
		<br />

		<!-- 按钮的_eventId_部分是spring web flow的一个线索，它表明接下来要触发的事件，当点击这个按钮提交表单时会触发phoneEntered事件 -->
		<input type="submit" name="_eventId_phoneEntered"
			value="Lookup Customer" />
	</sf:form>
</body>

</html>