package com.cangelescu.wine.dto;

import java.io.Serializable;
import java.util.List;

public class ClientB2BDTO extends UserDTO implements Serializable {

	private static final long serialVersionUID = 9121070165511985522L;

	private boolean visibility;

	private String companyName;

	private String cui;

	private boolean subscribed;

	private List<StockClientB2BDTO> stockClientB2B;

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCui() {
		return cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

	public List<StockClientB2BDTO> getStockClientB2B() {
		return stockClientB2B;
	}

	public void setStockClientB2B(List<StockClientB2BDTO> stockClientB2B) {
		this.stockClientB2B = stockClientB2B;
	}
}