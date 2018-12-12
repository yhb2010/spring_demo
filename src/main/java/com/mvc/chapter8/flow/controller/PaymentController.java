package com.mvc.chapter8.flow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.mvc.chapter8.flow.domain.CashOrCheckPayment;
import com.mvc.chapter8.flow.domain.CreditCardPayment;
import com.mvc.chapter8.flow.domain.Payment;
import com.mvc.chapter8.flow.domain.PaymentDetails;
import com.mvc.chapter8.flow.domain.PaymentType;
import com.mvc.chapter8.flow.service.CustomerService;

@Controller
public class PaymentController {

	@Autowired
	private CustomerService customerService;

	public Payment verifyPayment(PaymentDetails paymentDetails) {
		Payment payment = null;
		if (paymentDetails.getPaymentType() == PaymentType.CREDIT_CARD) {
			payment = new CreditCardPayment();
		} else {
			payment = new CashOrCheckPayment();
		}
		payment.setAmount(10000);

		return payment;
	}

}
