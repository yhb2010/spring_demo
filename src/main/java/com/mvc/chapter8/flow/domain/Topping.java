package com.mvc.chapter8.flow.domain;

import static org.apache.commons.lang.WordUtils.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * 披萨馅料
 * 
 * @author Administrator
 *
 */
public enum Topping implements Serializable {
	PEPPERONI, SAUSAGE, HAMBURGER, MUSHROOM, CANADIAN_BACON, PINEAPPLE, GREEN_PEPPER, JALAPENO, TOMATO, ONION, EXTRA_CHEESE;

	public static List<Topping> asList() {
		Topping[] all = Topping.values();
		return Arrays.asList(all);
	}

	@Override
	public String toString() {
		return capitalizeFully(name().replace('_', ' '));
	}
}
