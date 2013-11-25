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
}
