package org.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.spring.entity.Employee;
import org.spring.entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Transactional
	public void insert(Employee e) {
		this.hibernateTemplate.save(e);
		
	}
	public User getSingleData(String name) {
		User user= this.hibernateTemplate.get(User.class, name);
		return user;
		
	}
	public List<Employee> getAllData() {
		return this.hibernateTemplate.loadAll(Employee.class);
	}
	
	@Transactional
	public void delete(int id) {
		Employee e = this.hibernateTemplate.get(Employee.class, id);
		this.hibernateTemplate.delete(e);
		
	}
	@Transactional
	public void updateData(Employee e) {
		this.hibernateTemplate.update(e);
		
	}
	
}
