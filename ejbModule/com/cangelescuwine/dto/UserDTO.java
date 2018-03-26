package com.cangelescuwine.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	private int id;
	private String username;
	private String address;
	private String email;
	private String password;
	private static final long serialVersionUID = 1L;

	public UserDTO() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public UserDTO setPassword(String password) {
		this.password = password;
		return this;
	}

	public int getId() {
		return this.id;
	}

	public UserDTO setId(int id) {
		this.id = id;
		return this;
	}

	public String getUsername() {
		return this.username;
	}

	public UserDTO setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getAddress() {
		return this.address;
	}

	public UserDTO setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getEmail() {
		return this.email;
	}

	public UserDTO setEmail(String email) {
		this.email = email;
		return this;
	}

}
