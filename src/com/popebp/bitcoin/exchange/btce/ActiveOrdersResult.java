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
}
