package com.cangelescu.wine.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class StockSupplierDTO implements Serializable {

	private static final long serialVersionUID = -2532118993972958765L;
	
	private Integer id;

	private BigDecimal price;

	private int quantity;

	private SupplierDTO supplier;

	private WineDTO wine;

	private List<PromoDTO> promos;

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

	public SupplierDTO getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierDTO supplier) {
		this.supplier = supplier;
	}

	public WineDTO getWine() {
		return wine;
	}

	public void setWine(WineDTO wine) {
		this.wine = wine;
	}

	public List<PromoDTO> getPromos() {
		return promos;
	}

	public void setPromos(List<PromoDTO> promos) {
		this.promos = promos;
	}
}
