package com.popebp.bitcoin.exchange.btce;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public class GetInfoResult extends Result {
	private Map<Currency, BigDecimal> funds;
	private Rights rights;
	private BigInteger transactionCount;
	private BigInteger openOrders;
	private BigInteger serverTime;
	
	public Map<Currency, BigDecimal> getFunds() {
		return funds;
	}
	
	public Rights getRights() {
		return rights;
	}
	
	public BigInteger getTransactionCount() {
		return transactionCount;
	}
	
	public BigInteger getOpenOrders() {
		return openOrders;
	}
	
	public BigInteger getServerTime() {
		return serverTime;
	}
	
	public void setFunds(Map<Currency, BigDecimal> funds) {
		this.funds = funds;
	}
	
	public void setRights(Rights rights) {
		this.rights = rights;
	}
	
	public void setTransactionCount(BigInteger transactionCount) {
		this.transactionCount = transactionCount;
	}
	
	public void setOpenOrders(BigInteger openOrders) {
		this.openOrders = openOrders;
	}
	
	public void setServerTime(BigInteger serverTime) {
		this.serverTime = serverTime;
	}
}
