package com.cangelescu.wine.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderDTO implements Serializable {

	private static final long serialVersionUID = -2002328267470875517L;
	
	private Integer id;

	private Date date;

	private int orderNr;

	private ClientB2CDTO clientB2C;

	private List<OrderStockDTO> orderStock;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getOrderNr() {
		return orderNr;
	}

	public void setOrderNr(int orderNr) {
		this.orderNr = orderNr;
	}

	public ClientB2CDTO getClientB2C() {
		return clientB2C;
	}

	public void setClientB2C(ClientB2CDTO clientB2C) {
		this.clientB2C = clientB2C;
	}

	public List<OrderStockDTO> getOrderStock() {
		return orderStock;
	}

	public void setOrderStock(List<OrderStockDTO> orderStock) {
		this.orderStock = orderStock;
	}
}
