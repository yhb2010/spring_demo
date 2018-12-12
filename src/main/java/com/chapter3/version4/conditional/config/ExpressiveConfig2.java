package com.chapter3.version4.conditional.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.chapter2.version4.bean.BlankDisc;
import com.chapter2.version4.bean.CompactDisc;
import com.chapter2.version4.bean.SgtPeppers;
import com.chapter3.version4.bean.BlankDisc2;

@Configuration
//从外部配置文件注入值
@PropertySource("classpath:/com/chapter3/version4/conditional/config/app.properties")
public class ExpressiveConfig2 {

	//为了使用占位符，我们需要配置PropertySourcesPlaceholderConfigurer bean
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public CompactDisc disc(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist, @Value("${disc.num}") Integer num){
		return new BlankDisc(title, artist, num);
	}

}
