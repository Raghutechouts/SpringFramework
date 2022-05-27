package org.spring.BeanLifeCycleUsingJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDao {

	Connection con;
	private String driver;
	private String url;
	private String username;
	private String password;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@PostConstruct
	public void init() {
		getConnection();
	}

	public void getConnection() {

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void getData() throws ClassNotFoundException, SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from sample;");

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println();
		}

	}

	public void deleteData() throws ClassNotFoundException, SQLException {
		Statement st = con.createStatement();
		st.executeUpdate("delete from sample where id = 104");

	}

	@PreDestroy
	public void cleaningConnection() throws SQLException {
		System.out.println("Cleaning is done");
		con.close();
	}
}
