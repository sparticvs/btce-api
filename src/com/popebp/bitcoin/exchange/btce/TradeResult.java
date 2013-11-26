package com.popebp.bitcoin.exchange.btce;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class TradeResult extends Result {
	private BigDecimal received;
	private BigDecimal remains;
	private BigInteger orderId; // Set if remains > 0
	private List<Map<Currency, BigDecimal>> funds;
	public BigDecimal getReceived() {
		return received;
	}
	public BigDecimal getRemains() {
		return remains;
	}
	public BigInteger getOrderId() {
		return orderId;
	}
	public List<Map<Currency, BigDecimal>> getFunds() {
		return funds;
	}
	public void setReceived(BigDecimal received) {
		this.received = received;
	}
	public void setRemains(BigDecimal remains) {
		this.remains = remains;
	}
	public void setOrderId(BigInteger orderId) {
		this.orderId = orderId;
	}
	public void setFunds(List<Map<Currency, BigDecimal>> funds) {
		this.funds = funds;
	}
}
