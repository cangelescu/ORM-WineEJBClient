package com.cangelescu.wine.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cangelescu.wine.util.WineType;

public class WineDTO implements Serializable {

	private static final long serialVersionUID = -4131850171096209316L;

	private Integer id;

	private Date year;

	private String name;

	private String description;

	private String soi;

	private WineType type;

	private List<StockSupplierDTO> stockSupplier;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSoi() {
		return soi;
	}

	public void setSoi(String soi) {
		this.soi = soi;
	}

	public WineType getType() {
		return type;
	}

	public void setType(WineType type) {
		this.type = type;
	}

	public List<StockSupplierDTO> getStockSupplier() {
		return stockSupplier;
	}

	public void setStockSupplier(List<StockSupplierDTO> stockSupplier) {
		this.stockSupplier = stockSupplier;
	}

}