<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h2>添加新披萨</h2>
	<sf:form commandName="pizza">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />

		<b>Size: </b>
		<br />
		<sf:radiobutton path="size" label="Small (12-inch)" value="SMALL" />
		<br />
		<sf:radiobutton path="size" label="Medium (14-inch)" value="MEDIUM" />
		<br />
		<sf:radiobutton path="size" label="Large (16-inch)" value="LARGE" />
		<br />
		<sf:radiobutton path="size" label="Ginormous (20-inch)" value="GINORMOUS" />
		<br />

		<b>Toppings: </b>
		<br />
		<sf:checkboxes path="toppings" items="${toppingsList}" delimiter="<br/>" />
		<br />

		<input type="submit" class="button" name="_eventId_addPizza"
			value="购买" />
		<input type="submit" class="button" name="_eventId_cancel"
			value="Cancel" />
			
	</sf:form>
	
</body>
</html>