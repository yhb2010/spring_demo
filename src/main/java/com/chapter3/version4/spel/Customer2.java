package com.chapter3.version4.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//SpEL支持三目运算符，以此来实现条件语句。
@Component("customerBean2")
public class Customer2 {
	
	@Value("#{itemBean2.qtyOnHand < 100 ? true : false}")
    private boolean warning;
 
    public boolean isWarning() {
        return warning;
    }
 
    public void setWarning(boolean warning) {
        this.warning = warning;
    }
 
    @Override
    public String toString() {
        return "Customer [warning=" + warning + "]";
    }

}
