package com.chapter2.version4.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.chapter2.version4.bean.CDPlayer;
import com.chapter2.version4.bean.CompactDisc;

//使用java代码装配bean
@Configuration
//在Config中引入另外一个Config文件
@Import(CDConfig.class)
//在Config中引入xml配置
//@ImportResource("classpath:cd-config.xml")
public class CDPlayerConfig {

	@Bean
	public CDPlayer cdPlayer(CompactDisc cd){
		return new CDPlayer(cd);
	}

}
