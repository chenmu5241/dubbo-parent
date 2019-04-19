package net.newglobe.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.newglobe.service.consumer.TestService;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("dubbo-applicationContext.xml");
		TestService bean = ac.getBean(TestService.class);
		bean.test();
		ac.close();
	}

}

