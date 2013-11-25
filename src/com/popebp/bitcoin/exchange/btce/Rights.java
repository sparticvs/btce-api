package com.popebp.bitcoin.exchange.btce;

public class Rights {
	public boolean info;
	public boolean trade;
	
	public boolean hasInfo() {
		return info;
	}
	
	public boolean hasTrade() {
		return trade;
	}
	
	public void setInfo(boolean info) {
		this.info = info;
	}
	
	public void setTrade(boolean trade) {
		this.trade = trade;
	}
}
