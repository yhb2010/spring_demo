package com.mvc.chapter12.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.mvc.chapter7.domain.User;

@Service
public class AlertServiceImpl implements AlertService {

	public void sendSpittleAlert(final User user) {
		System.out.println("---------------生产者发了一个消息：" + user);

		// user.alert.queue指定消息目的地
		// 也可以在bean里面指定默认目的地，这样就不需要user.alert.queue了
		// jmsTemplate.send("user.alert.queue", new MessageCreator() {
		jmsTemplate.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(user);
			}
		});
	}

	@Autowired
	JmsTemplate jmsTemplate;

}
