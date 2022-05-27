package org.spring.SpringJdbc;

import java.util.List;
import java.util.Map;

import org.spring.employeedao.EmployeeDao;
import org.spring.entity.Employee;
import org.spring.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/spring/SpringJdbc/ApplicationContext.xml");
		EmployeeDao empDao = context.getBean("empDao", EmployeeDao.class);
		//empDao.create();
		//System.out.println(empDao.insert(new Employee(102, "virat", 2000)));

		List<User> list = empDao.getAllData();
		for (User u : list) {
			System.out.println(u.getName());
		}
		System.out.println(empDao.getSingleObjectData("pant"));
		System.out.println(empDao.getName("pant123"));
		List<Map<String, Object>> list1 = empDao.getList();
		for (Map<String, Object> u : list1) {
			System.out.println(u.getOrDefault(list1, u));
		}
		empDao.createAnother();
		empDao.batchUpdate(list);
	}
}
