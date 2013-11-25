package com.popebp.bitcoin.exchange.btce;

public class CurrencyPair {
	private Currency currencyX;
	private Currency currencyY;
	
	public Currency getCurrencyX() {
		return currencyX;
	}
	
	public Currency getCurrencyY() {
		return currencyY;
	}
	
	public void setCurrencyX(Currency currencyX) {
		this.currencyX = currencyX;
	}
	
	public void setCurrencyY(Currency currencyY) {
		this.currencyY = currencyY;
	}

	@Override
	public String toString() {
		return String.format("%s_%s", this.currencyX.toString(), this.currencyY.toString());
	}
}
