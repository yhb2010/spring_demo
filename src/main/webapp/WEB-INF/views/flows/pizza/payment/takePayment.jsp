<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<script>
	function showCreditCardField() {
		var ccNumberStyle = document.paymentForm.creditCardNumber.style;
		ccNumberStyle.visibility = 'visible';
	}

	function hideCreditCardField() {
		var ccNumberStyle = document.paymentForm.creditCardNumber.style;
		ccNumberStyle.visibility = 'hidden';
	}
</script>

<body>
	<h2>Take Payment</h2>
	<sf:form commandName="paymentDetails" name="paymentForm">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />

		<sf:radiobutton path="paymentType" value="CASH"
			label="Cash (taken at delivery)" onclick="hideCreditCardField()" />
		<br />
		<sf:radiobutton path="paymentType" value="CHECK"
			label="Check (taken at delivery)" onclick="hideCreditCardField()" />
		<br />
		<sf:radiobutton path="paymentType" value="CREDIT_CARD"
			label="Credit Card:" onclick="showCreditCardField()" />


		<sf:input path="creditCardNumber" cssStyle="visibility:hidden;" />

		<br />
		<br />
		<input type="submit" class="button" name="_eventId_paymentSubmitted"
			value="提交" />
		<input type="submit" class="button" name="_eventId_cancel"
			value="Cancel" />
	</sf:form>
	
</body>
</html>