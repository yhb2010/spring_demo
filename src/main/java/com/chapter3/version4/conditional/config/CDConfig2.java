package com.chapter3.version4.conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.chapter2.version4.bean.CompactDisc;
import com.chapter2.version4.bean.SgtPeppers;

@Configuration
public class CDConfig2 {

	@Bean
	//方法级别可以放在标识由@Bean的方法上
	//类级别可以放在注标识有@Component（包含@Configuration）的类上
	//意思是只有满足一些列条件之后创建一个bean
	@Conditional(WindowsCondition2.class)
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}

}
