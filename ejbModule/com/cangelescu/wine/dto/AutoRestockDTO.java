package com.cangelescu.wine.dto;

import java.io.Serializable;

public class AutoRestockDTO implements Serializable {

	private static final long serialVersionUID = -1647828419952031048L;
	
	private Integer id;

	private boolean active;

	private int limit;

	private StockClientB2BDTO stockClientB2B;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public StockClientB2BDTO getStockClientB2B() {
		return stockClientB2B;
	}

	public void setStockClientB2B(StockClientB2BDTO stockClientB2B) {
		this.stockClientB2B = stockClientB2B;
	}

}
