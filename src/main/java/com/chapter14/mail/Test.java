package com.chapter14.mail;

import javax.mail.MessagingException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws MessagingException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter14/mail/xml/bytype.xml");
		EmailService mail = (EmailService) ctx.getBean("emailService");
		// mail.sendSimpleEmail("youtong82@163.com", "测试");

		// mail.sendEmailWithAttachment("youtong82@163.com", "测试附件");

		// mail.sendRichEmail("youtong82@163.com", "测试附件");

		mail.sendTemplateEmail("youtong82@163.com");
	}

}
