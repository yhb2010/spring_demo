<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div>
	<h2>A global community of friends and strangers spitting out their
		inner-most and personal thoughts on the web for everyone else to see.</h2>
	<h3>注册新用户</h3>

	<sf:form method="post" modelAttribute="user" action="/users" enctype="multipart/form-data">
		<fieldset>
			id：<sf:input path="id"/><sf:errors path="id" cssClass="error" /><br/>
			name：<sf:input path="name"/><sf:errors path="name" cssClass="error" /><br/>
			password：<sf:input path="password"/><sf:errors path="password" cssClass="error" /><br/>
			Profile image：<input name="image" type="file"/>
			<input name="commit" type="submit"
                    value="I accept. Create my account." />
		</fieldset>
	</sf:form>
</div>
