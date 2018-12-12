package com.chapter3.version4.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Spring EL 支持大多数的数学操作符、逻辑操作符、关系操作符。

　　1.关系操作符

　　包括：等于 (==, eq)，不等于 (!=, ne)，小于 (<, lt),，小于等于(<= , le)，大于(>, gt)，大于等于 (>=, ge)

　　2.逻辑操作符

　　包括：and，or，and not(!)

　　3.数学操作符

　　包括：加 (+)，减 (-)，乘 (*)，除 (/)，取模 (%)，幂指数 (^)。
 * */
@Component("NumCustomerBean")
public class NumCustomer {
	
	@Value("#{1 == 1}") //true
    private boolean testEqual;
 
    @Value("#{1 != 1}") //false
    private boolean testNotEqual;
 
    @Value("#{1 < 1}") //false
    private boolean testLessThan;
 
    @Value("#{1 <= 1}") //true
    private boolean testLessThanOrEqual;
 
    @Value("#{1 > 1}") //false
    private boolean testGreaterThan;
 
    @Value("#{1 >= 1}") //true
    private boolean testGreaterThanOrEqual;
 
    //Logical operators , numberBean.no == 999
 
    @Value("#{numberBean.no == 999 and numberBean.no < 900}") //false
    private boolean testAnd;
 
    @Value("#{numberBean.no == 999 or numberBean.no < 900}") //true
    private boolean testOr;
 
    @Value("#{!(numberBean.no == 999)}") //false
    private boolean testNot;
 
    //Mathematical operators
 
    @Value("#{1 + 1}") //2.0
    private double testAdd;
 
    @Value("#{'1' + '@' + '1'}") //1@1
    private String testAddString;
 
    @Value("#{1 - 1}") //0.0
    private double testSubtraction;
 
    @Value("#{1 * 1}") //1.0
    private double testMultiplication;
 
    @Value("#{10 / 2}") //5.0
    private double testDivision;
 
    @Value("#{10 % 10}") //0.0
    private double testModulus ;
 
    @Value("#{2 ^ 2}") //4.0
    private double testExponentialPower;
 
    @Override
    public String toString() {
        return "Customer [testEqual=" + testEqual + ", testNotEqual="
                + testNotEqual + ", testLessThan=" + testLessThan
                + ", testLessThanOrEqual=" + testLessThanOrEqual
                + ", testGreaterThan=" + testGreaterThan
                + ", testGreaterThanOrEqual=" + testGreaterThanOrEqual
                + ", testAnd=" + testAnd + ", testOr=" + testOr + ", testNot="
                + testNot + ", testAdd=" + testAdd + ", testAddString="
                + testAddString + ", testSubtraction=" + testSubtraction
                + ", testMultiplication=" + testMultiplication
                + ", testDivision=" + testDivision + ", testModulus="
                + testModulus + ", testExponentialPower="
                + testExponentialPower + "]";
    }

}
