package com.mvc.chapter8.flow.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * 订单
 * 
 * @author Administrator
 * 
 */
@Repository
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	private Customer customer;
	private List<Pizza> pizzas;
	private Payment payment;
	private float total = 0;

	public Order() {
		pizzas = new ArrayList<Pizza>();
		customer = new Customer();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
		total += 100;
	}

	public float getTotal() {
		return total;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}
