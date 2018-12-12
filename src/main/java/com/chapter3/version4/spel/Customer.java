package com.chapter3.version4.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {

	@Value("#{itemBean}")
	private Item item;
	@Value("#{itemBean.name}")
	private String itemName;

	@Override
	public String toString() {
		return "itemName=" + this.itemName + " " + "Item.total=" + this.item.getTotal();
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
