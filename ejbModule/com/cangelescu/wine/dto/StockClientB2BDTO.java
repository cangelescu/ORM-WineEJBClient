package com.cangelescu.wine.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class StockClientB2BDTO implements Serializable {

	private static final long serialVersionUID = 1677297022011657643L;

	private Integer id;

	private BigDecimal price;

	private int quantity;

	private ClientB2BDTO clientB2B;

	private List<AutoRestockDTO> autoRestock;

	private List<OrderStockDTO> orderStock;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ClientB2BDTO getClientB2B() {
		return clientB2B;
	}

	public void setClientB2B(ClientB2BDTO clientB2B) {
		this.clientB2B = clientB2B;
	}

	public List<AutoRestockDTO> getAutoRestock() {
		return autoRestock;
	}

	public void setAutoRestock(List<AutoRestockDTO> autoRestock) {
		this.autoRestock = autoRestock;
	}

	public List<OrderStockDTO> getOrderStock() {
		return orderStock;
	}

	public void setOrderStock(List<OrderStockDTO> orderStock) {
		this.orderStock = orderStock;
	}
}