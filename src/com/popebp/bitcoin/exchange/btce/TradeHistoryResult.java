package com.popebp.bitcoin.exchange.btce;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TradeHistoryResult extends Result {
	private BigInteger tradeId; // This is actually quite confusing...
	private CurrencyPair pair;
	private TradeType type;
	private BigDecimal amount;
	private BigDecimal rate;
	private BigInteger orderId;
	private boolean isYourOrder;
	private BigInteger timestamp;
	
	public BigInteger getTradeId() {
		return tradeId;
	}
	
	public CurrencyPair getPair() {
		return pair;
	}
	
	public TradeType getType() {
		return type;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public BigDecimal getRate() {
		return rate;
	}
	
	public BigInteger getOrderId() {
		return orderId;
	}
	
	public boolean isYourOrder() {
		return isYourOrder;
	}
	
	public BigInteger getTimestamp() {
		return timestamp;
	}
	
	public void setTradeId(BigInteger tradeId) {
		this.tradeId = tradeId;
	}
	
	public void setPair(CurrencyPair pair) {
		this.pair = pair;
	}
	
	public void setType(TradeType type) {
		this.type = type;
	}
	
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	
	public void setOrderId(BigInteger orderId) {
		this.orderId = orderId;
	}
	
	public void setYourOrder(boolean isYourOrder) {
		this.isYourOrder = isYourOrder;
	}
	
	public void setTimestamp(BigInteger timestamp) {
		this.timestamp = timestamp;
	}
}
