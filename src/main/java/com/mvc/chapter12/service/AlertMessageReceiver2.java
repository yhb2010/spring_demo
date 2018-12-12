package com.mvc.chapter12.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import com.mvc.chapter7.domain.User;

@Service
public class AlertMessageReceiver2 {

	@Autowired
	JmsTemplate jmsTemplate;

	public void getAlert(User user) {
		System.out.println("接收到一个消息2。");
		try {
			System.out.println("消息内容是2：" + user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
