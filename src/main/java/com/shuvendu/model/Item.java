package com.shuvendu.model;

import java.util.Date;

public class Item {
	
	private Token token;
	
	private double totalQuantity;
	
	private double totalBuyPrice;
	
	//avg is all buy / quality
	private double avgPricePerToken;
	
	private double currentPricePerToken;
	
	//total of total sold + current - totalBuy
	private double profitLoss;
	
	//total sold money
	private double profitBooked;
	
	private Date lastUpdated;

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public double getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(double totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public double getTotalBuyPrice() {
		return totalBuyPrice;
	}

	public void setTotalBuyPrice(double totalBuyPrice) {
		this.totalBuyPrice = totalBuyPrice;
	}

	public double getAvgPricePerToken() {
		return avgPricePerToken;
	}

	public void setAvgPricePerToken(double avgPricePerToken) {
		this.avgPricePerToken = avgPricePerToken;
	}

	public double getCurrentPricePerToken() {
		return currentPricePerToken;
	}

	public void setCurrentPricePerToken(double currentPricePerToken) {
		this.currentPricePerToken = currentPricePerToken;
	}

	public double getProfitLoss() {
		return profitLoss;
	}

	public void setProfitLoss(double profitLoss) {
		this.profitLoss = profitLoss;
	}

	public double getProfitBooked() {
		return profitBooked;
	}

	public void setProfitBooked(double profitBooked) {
		this.profitBooked = profitBooked;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Item(Token token, double totalQuantity, double totalBuyPrice) {
		super();
		this.token = token;
		this.totalQuantity = totalQuantity;
		this.totalBuyPrice = totalBuyPrice;
		this.avgPricePerToken = totalBuyPrice / totalQuantity;
		this.currentPricePerToken = this.avgPricePerToken;
		this.profitLoss = 0;
		this.profitBooked = 0;
		this.lastUpdated = new Date();
	}
	
	
	
}
