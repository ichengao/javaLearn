package org.tarena.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tarena.entity.User;

public class TestUserService {
	@Test
	public void testUserService(){
		String conf="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
		UserService userService=ac.getBean("userService",UserService.class);
		
		User tom=userService.login("tom1","123");
		System.out.println(tom);
	
	}
}
