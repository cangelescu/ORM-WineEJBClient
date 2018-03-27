package com.cangelescu.wine.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderStockDTO implements Serializable {

	private static final long serialVersionUID = -6651613494061146163L;
	
	private Integer id;

	private StockClientB2BDTO stockClientB2B;

	private OrderDTO order;

	private BigDecimal price;

	private int quantity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StockClientB2BDTO getStockClientB2B() {
		return stockClientB2B;
	}

	public void setStockClientB2B(StockClientB2BDTO stockClientB2B) {
		this.stockClientB2B = stockClientB2B;
	}

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
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

}
