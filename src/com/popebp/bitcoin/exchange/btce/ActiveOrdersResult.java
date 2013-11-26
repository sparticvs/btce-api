package com.popebp.bitcoin.exchange.btce;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ActiveOrdersResult extends Result {
	private BigInteger orderId;
	private CurrencyPair pair;
	private TradeType type;
	private BigDecimal amount;
	private BigDecimal rate;
	private BigInteger timestampCreated;
	private TransactionStatus status; // I don't think this is the same as TransHistory.status...
	public BigInteger getOrderId() {
		return orderId;
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
	public BigInteger getTimestampCreated() {
		return timestampCreated;
	}
	public TransactionStatus getStatus() {
		return status;
	}
	public void setOrderId(BigInteger orderId) {
		this.orderId = orderId;
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
	public void setTimestampCreated(BigInteger timestampCreated) {
		this.timestampCreated = timestampCreated;
	}
	public void setStatus(TransactionStatus status) {
		this.status = status;
	}
}
