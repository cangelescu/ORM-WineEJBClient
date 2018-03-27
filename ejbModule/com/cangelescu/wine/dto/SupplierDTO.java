package com.cangelescu.wine.dto;

import java.io.Serializable;
import java.util.List;

public class SupplierDTO extends UserDTO implements Serializable {

	private static final long serialVersionUID = -4743229528680746618L;

	private Integer id;

	private boolean visibility;

	private String cellarName;

	private int age;

	private List<StockSupplierDTO> stockSupplier;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	public String getCellarName() {
		return cellarName;
	}

	public void setCellarName(String cellarName) {
		this.cellarName = cellarName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<StockSupplierDTO> getStockSupplier() {
		return stockSupplier;
	}

	public void setStockSupplier(List<StockSupplierDTO> stockSupplier) {
		this.stockSupplier = stockSupplier;
	}
}