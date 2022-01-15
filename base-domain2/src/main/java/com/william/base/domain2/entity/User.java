package com.william.base.domain2.entity;

import lombok.Data;

@Data
public class User {
	
	private String userId;
	private String username;
	private String password;
	private Integer age;
	
	@Override
	public String toString() {
		return "userId: "+userId+"username: "+username+", password: "+password+", age: "+age;
	}	
}
