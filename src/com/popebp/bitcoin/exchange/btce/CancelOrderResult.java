package com.popebp.bitcoin.exchange.btce;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public class CancelOrderResult extends Result {
	private BigInteger orderId; // Set if remains > 0
	private Map<Currency, BigDecimal> funds;
	
	public BigInteger getOrderId() {
		return orderId;
	}
	
	public Map<Currency, BigDecimal> getFunds() {
		return funds;
	}
	
	public void setOrderId(BigInteger orderId) {
		this.orderId = orderId;
	}
	
	public void setFunds(Map<Currency, BigDecimal> funds) {
		this.funds = funds;
	}
}
