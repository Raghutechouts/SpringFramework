package org.spring.BeanLifeCycleUsingJDBC;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args ) throws ClassNotFoundException, SQLException
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/org/spring/BeanLifeCycleUsingJDBC/beans.xml");
		StudentDao st = context.getBean("student",StudentDao.class);
		st.getData();
		context.close();
	}
}
