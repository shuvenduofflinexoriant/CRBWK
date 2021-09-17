package com.shuvendu.model;

import java.util.Date;

public class Transaction {
	
	private Token token;
	private double perItemPrice;
	private double quantity;
	private boolean isBuy = false;
	private Date date;
	
	
	
	public Transaction(Token token, double perItemPrice, double quantity, Date date) {
		super();
		this.token = token;
		this.perItemPrice = perItemPrice;
		this.quantity = quantity;
		this.date = date;
	}
	
	public Transaction(Token token, double perItemPrice, double quantity) {
		super();
		this.token = token;
		this.perItemPrice = perItemPrice;
		this.quantity = quantity;
		this.date = new Date();
	}
	
	public Transaction(Token token, double perItemPrice, double quantity, boolean isBuy) {
		super();
		this.token = token;
		this.perItemPrice = perItemPrice;
		this.quantity = quantity;
		this.date = new Date();
		this.isBuy = isBuy;
	}
	
	public Token getToken() {
		return token;
	}
	public void setToken(Token token) {
		this.token = token;
	}
	public double getPerItemPrice() {
		return perItemPrice;
	}
	public void setPerItemPrice(double perItemPrice) {
		this.perItemPrice = perItemPrice;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return this.perItemPrice * this.quantity;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isBuy() {
		return isBuy;
	}

	public void setBuy(boolean isBuy) {
		this.isBuy = isBuy;
	}
	
	
}
