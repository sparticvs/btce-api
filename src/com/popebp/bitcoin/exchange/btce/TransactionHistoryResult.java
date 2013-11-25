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
}
