package com.cangelescu.wine.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PromoDTO implements Serializable {

	private static final long serialVersionUID = 2443393944731236502L;

	private Integer id;

	private StockSupplierDTO stocksupplier;

	private Date startDate;

	private Date endDate;

	private BigDecimal discount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StockSupplierDTO getStocksupplier() {
		return stocksupplier;
	}

	public void setStocksupplier(StockSupplierDTO stocksupplier) {
		this.stocksupplier = stocksupplier;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

}
