package com.chapter3.version4.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean2")
public class Item2 {
	
	@Value("99")
    private int qtyOnHand;
 
    public int getQtyOnHand() {
        return qtyOnHand;
    }
 
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

}
