package com.popebp.bitcoin.exchange.btce;

public class CurrencyPairFactory {

	public static CurrencyPair parsePair(String pair) {
		
		String[] currencies = pair.split("_");
		
		if(currencies.length != 2) {
			// TODO: Throw exception
			return null;
		}
		
		return CurrencyPairFactory.createPair(
				CurrencyFactory.parseCurrency(currencies[0]),
				CurrencyFactory.parseCurrency(currencies[1]));
	}
	
	public static CurrencyPair createPair(Currency c0, Currency c1) {
		CurrencyPair cPair = new CurrencyPair();
		
		cPair.setCurrencyX(c0);
		cPair.setCurrencyY(c1);

		return cPair;
	}
}
