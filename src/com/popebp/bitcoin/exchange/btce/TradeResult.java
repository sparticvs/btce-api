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
}
