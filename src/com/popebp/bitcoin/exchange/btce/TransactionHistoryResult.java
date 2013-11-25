package com.popebp.bitcoin.exchange.btce;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TransactionHistoryResult extends Result {
	private BigInteger transactionId;
	private TradeType type; // This is the wrong type, need a different enum for this...
	private BigDecimal amount;
	private Currency currency;
	private String description;
	private TransactionStatus status;
	private BigInteger timestamp;
	public BigInteger getTransactionId() {
		return transactionId;
	}
	public TradeType getType() {
		return type;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public String getDescription() {
		return description;
	}
	public TransactionStatus getStatus() {
		return status;
	}
	public BigInteger getTimestamp() {
		return timestamp;
	}
	public void setTransactionId(BigInteger transactionId) {
		this.transactionId = transactionId;
	}
	public void setType(TradeType type) {
		this.type = type;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setStatus(TransactionStatus status) {
		this.status = status;
	}
	public void setTimestamp(BigInteger timestamp) {
		this.timestamp = timestamp;
	}
}
