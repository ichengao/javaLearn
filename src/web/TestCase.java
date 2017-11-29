package web;

import java.util.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	public void TestCreateBeanObject(){
		String conf="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
		
		Date date=ac.getBean("dateObj", Date.class);
		System.out.println(date);
		
	}
}
