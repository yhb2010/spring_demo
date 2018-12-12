package com.chapter2.version4.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.chapter2.version4.bean.CompactDisc;
import com.chapter2.version4.bean.SgtPeppers;

//使用java代码装配bean
@Configuration
public class CDConfig {

	//声明一个bean，bean id就是方法的名字，bean实例就是方法的返回对象，Bean注解里有name属性
	@Bean
	public CompactDisc sgtPeppers(){
		//甚至可以使用任何方式来创建bean
		return new SgtPeppers();
	}

}
