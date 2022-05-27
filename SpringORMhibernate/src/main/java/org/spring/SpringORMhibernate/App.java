package org.spring.SpringORMhibernate;

import java.util.List;

import org.spring.dao.EmployeeDao;
import org.spring.entity.Employee;
import org.spring.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("org/spring/SpringORMhibernate/ApplicationContext.xml");
    	EmployeeDao emoDao = context.getBean("empDao",EmployeeDao.class);
//    	emoDao.insert(new Employee(103, "rohit", 11000));
//    	emoDao.delete(1011);
//    	emoDao.updateData(new Employee(105, "rahul",11000));
    	System.out.println(emoDao.getAllData());
    	
    	
    	
    }
}
