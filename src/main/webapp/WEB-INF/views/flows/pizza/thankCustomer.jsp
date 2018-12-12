<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div>
	<h3>感谢惠顾</h3>
	
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
	
	<h3>账户信息:</h3>
	<b>${order.payment.amount}</b>
	<br />
</div>