package org.tarena.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tarena.entity.User;

public class TestUserDAO {
	@Test
	public void testUserDAO(){
		String conf="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
		UserDAO userDAO=ac.getBean("userDAO", UserDAO.class);
		User tom=userDAO.findByName("tom1");
		System.out.println(tom);
	}
}
