package com.chapter3.version4.conditional.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.chapter2.version4.bean.BlankDisc;
import com.chapter2.version4.bean.CompactDisc;
import com.chapter2.version4.bean.SgtPeppers;

@Configuration
//从外部配置文件注入值
@PropertySource("classpath:/com/chapter3/version4/conditional/config/app.properties")
public class ExpressiveConfig {
	
	@Autowired
	Environment env;

	@Bean
	public CompactDisc disc(){
		return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"), env.getProperty("disc.num", Integer.class));
	}

}
