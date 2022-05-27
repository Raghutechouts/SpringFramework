package org.spring.employeedao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.spring.entity.Employee;
import org.spring.entity.User;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void create() { // to create table
		this.jdbcTemplate.execute("create table  emp_0010(id int, name varchar(20),salary int)");
	}

	public int insert(Employee e) { // to insert data into table

		return this.jdbcTemplate.update(
				"insert into emp_0010 values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')");

	}

	public int empUpdate(Employee e) { // to update table

		return this.jdbcTemplate.update("update emp_0010 set  name='" + e.getName() + "',salary='" + e.getSalary()
				+ "' where id='" + e.getId() + "')");

	}

	public int delete(Employee e) { // to delete data

		return this.jdbcTemplate.update("delete from emp_0010 where id='" + e.getId() + "' ");

	}

	public List<User> getAllData() { // get list of (objects) data using RowMapper
		return this.jdbcTemplate.query("select * from userdata", new RowMapper<User>() {

			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User();
				u.setName(rs.getString(1));
				u.setEmail(rs.getString(2));
				u.setUsername(rs.getString(3));
				u.setPassword(rs.getString(4));
				return u;
			}
		});
	}

	public User getSingleObjectData(String name) {

		String query = "select * from userdata where name=?";
		return this.jdbcTemplate.queryForObject(query, new Object[] { name }, new RowMapper<User>() {
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User();
				u.setName(rs.getString(1));
				u.setEmail(rs.getString(2));
				u.setUsername(rs.getString(3));
				u.setPassword(rs.getString(4));
				return u;
			}
		});

	}

	public String getName(String username) {
		return this.jdbcTemplate.queryForObject("select name from userdata where username='" + username + "'",
				String.class);
	}

	public List<Map<String, Object>> getList() {
		return this.jdbcTemplate.queryForList("select * from userdata");
	}

	public void createAnother() { // to create table
		this.jdbcTemplate.execute(
				"create table  userdata_01(name varchar(20),email varchar(25),uesrname varchar(25),password varchar(25))");
	}

	public int[] batchUpdate(final List<User> users) {
		return this.jdbcTemplate.batchUpdate(" insert into userdata_01 values(?,?,?,?)",
				new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i) throws SQLException {
						User user = users.get(i);
						ps.setString(1, user.getName());
						ps.setString(2, user.getEmail());
						ps.setString(3, user.getUsername());
						ps.setString(4, user.getPassword());

					}

					public int getBatchSize() {
						return users.size();
					}
				});
	}

}
