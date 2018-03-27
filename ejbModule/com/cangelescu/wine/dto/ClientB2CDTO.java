package com.cangelescu.wine.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ClientB2CDTO extends UserDTO implements Serializable {

	private static final long serialVersionUID = 6577901051368281055L;

	private String firstName;

	private String lastName;

	private Date registerDate;

	private String cnp;

	private List<OrderDTO> orders;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public List<OrderDTO> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDTO> orders) {
		this.orders = orders;
	}

}