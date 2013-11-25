package com.popebp.bitcoin.exchange.btce;

public class CurrencyFactory {
	
	public static Currency parseCurrency(String currency) {
		
		return Currency.valueOf(currency.toUpperCase());		
	}
}
