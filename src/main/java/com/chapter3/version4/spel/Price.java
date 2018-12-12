package com.chapter3.version4.spel;

import org.springframework.stereotype.Component;

@Component("priceBean")
public class Price {
	
	public double getSpecialPrice() {
        return new Double(99.99);
    }

}
