package com.boraji.pojo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Userpojo {
	
	//private Long id;
	@Size(max = 20, min = 3, message = "{user.name.invalid}")
	private String name;	
	
	@Email(message = "{user.email.invalid}")
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
