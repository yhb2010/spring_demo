package com.mvc.chapter8.flow.domain;

import static org.apache.commons.lang.WordUtils.*;

import java.util.Arrays;
import java.util.List;

/**
 * 付款方式
 * 
 * @author Administrator
 *
 */
public enum PaymentType {
	CASH, CHECK, CREDIT_CARD;

	public static List<PaymentType> asList() {
		PaymentType[] all = PaymentType.values();
		return Arrays.asList(all);
	}

	@Override
	public String toString() {
		return capitalizeFully(name().replace('_', ' '));
	}
}
