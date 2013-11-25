package com.popebp.bitcoin.exchange.btce;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class CancelOrderResult extends Result {
	private BigInteger orderId; // Set if remains > 0
	private List<Map<Currency, BigDecimal>> funds;
}
