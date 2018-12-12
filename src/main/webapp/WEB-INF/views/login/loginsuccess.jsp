<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<div>
	<h2>登录成功</h2>
	<!-- var="myname"：默认是pageContext域 -->
	<security:authentication property="principal.username" var="myname" />
	登录名：${myname }

	<security:authorize access="hasRole('ROLE_TEST')">
		<br />你好，必须有ROLE_TEST权限的人才能看到我
	</security:authorize>

	<br /> <a href="/security/exec">请单击，只有ROLE_TEST才能执行</a> <br />

	<form action="/security/exec2" method="post">
		ROLE_MVC、ROLE_ADMIN都可以访问，但ROLE_ADMIN可以输入内容 <input name="inputs" /> <input
			type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<input type="submit" value="提交" />
	</form>

	<a href="/security/exec3">只有admin用户可以访问</a> <br />

	<form action="/security/exec4" method="post">
		查询用户：<input name="searchName" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
			type="submit" value="提交" />
	</form>

	<a href="/security2/exec">只有ROLE_TEST用户可以访问</a> <br />

	<form action="/security2/exec2" method="post">
		查询用户：<input name="inputs" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
			type="submit" value="提交" />只有ROLE_TEST用户可以访问(增加has)
	</form>

	<form action="/logout" method="post">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /><input type="submit" value="退出" />
	</form>
</div>