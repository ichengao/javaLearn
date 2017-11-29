package org.tarena.dao;

import java.sql.Connection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	public void testJDBCDataSource() throws Exception{
		String conf="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
		System.out.println(ac);
		JDBCDataSource ds=ac.getBean("dataSource",JDBCDataSource.class);
		Connection conn=ds.getConnection();
		System.out.println(conn);
	}
}
