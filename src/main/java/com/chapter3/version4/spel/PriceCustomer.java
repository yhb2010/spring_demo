package com.chapter3.version4.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//SpEL允许开发者用El运行方法函数，并且允许将方法返回值注入到属性中。
@Component("PriceCustomerBean")
public class PriceCustomer {
	
	@Value("#{'lei'.toUpperCase()}")
    private String name;
 
    @Value("#{priceBean.getSpecialPrice()}")
    private double amount;
    
    //getter and setter...省略
 
    @Override
    public String toString() {
        return "Customer [name=" + name + ", amount=" + amount + "]";
    }

}
