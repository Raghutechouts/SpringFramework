package org.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveData(User user) {

				return (Integer) this.hibernateTemplate.save(user);

	}

	public List<User> getAllData() {

		return this.hibernateTemplate.loadAll(User.class);
	}

}
