<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h2>展示订单</h2>

	<h3>收货人信息:</h3>
	<b>${order.customer.name}</b>
	<br />
	<b>${order.customer.address}</b>
	<br />
	<b>${order.customer.city}, ${order.customer.state}
		${order.customer.zipCode}</b>
	<br />
	<b>${order.customer.phoneNumber}</b>
	<br />
	<hr />
	<h3>
		订单总价:${order.total}
	</h3>
	<hr />
	<c:forEach items="${order.pizzas}" var="pizza">
		<li>${pizza.size}: 
			<c:forEach items="${pizza.toppings}" var="topping">
				<c:out value="${topping}" />,
			</c:forEach>
		</li>
	</c:forEach>

	<sf:form>
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
		
		<input type="submit" name="_eventId_createPizza" value="添加披萨" />
		<c:if test="${fn:length(order.pizzas) gt 0}">
			<input type="submit" name="_eventId_checkout" value="结账" />
		</c:if>
		<input type="submit" name="_eventId_cancel" value="Cancel" />
	</sf:form>

</body>
</html>