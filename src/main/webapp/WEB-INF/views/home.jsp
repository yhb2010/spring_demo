<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div>
	<h2>A global community of friends and strangers spitting out their
		inner-most and personal thoughts on the web for everyone else to see.</h2>
	<h3>Look at what these people are spitting right now...</h3>

	<ol class="spittle-list">
		<c:forEach var="user" items="${users}">
			<li>
				<a href="/users/user?name=${user.name}">${user.name}</a>
				<span class="spittleListText">
					${user.password}
				</span>
			</li>
		</c:forEach>
	</ol>

	<a href="/users?new">注册</a>

	<br/><a href="/clientSay?name=adb">调用服务端rmi</a>

	<br/><a href="/clientSayHessian?name=adb">调用服务端hessian</a>

	<br/><a href="/clientSayBurlap?name=adb">调用服务端burlap</a>

	<br/><a href="/clientSayInvoker?name=adb">调用服务端invoker</a>

	<br/><a href="/clientSayJaxWs?name=wsadb">调用服务端JAX-WS</a>

	<br/><a href="/clientSayJms?name=wsadb">调用服务端Jms</a>
	<br/>


	====================================================<br/>
	RESTFul<br/>
	<c:forEach var="user" items="${users}">
		<li>
			<a href="/restful/users/${user.id}/${user.name}">${user.name}</a>
		</li>
	</c:forEach>

	====================================================<br/>
	<a href="/jms/user?name=zhang">jms demo</a>
</div>
