package org.spring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class Admin {
	
	
	@Email
	@NotNull
	@NotEmpty
	private String mail;
	
	@NotNull
	@Pattern(regexp="^[a-zA-Z0-9]{6,15}")  
	private String pass;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	

	
}
