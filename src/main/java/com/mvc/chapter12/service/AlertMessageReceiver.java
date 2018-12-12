package com.mvc.chapter12.service;

import javax.jms.Message;
import javax.jms.MessageListener;
import org.apache.activemq.command.ActiveMQObjectMessage;
import org.springframework.stereotype.Service;
import com.mvc.chapter7.domain.User;

@Service
public class AlertMessageReceiver implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// 这里我们知道生产者发送的就是一个消息，所以这里可以直接进行强制转换
		try {
			System.out.println("接收到一个消息。");
			ActiveMQObjectMessage textMsg = (ActiveMQObjectMessage) message;

			User u = (User) textMsg.getObject();
			System.out.println("消息内容是：" + u);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
