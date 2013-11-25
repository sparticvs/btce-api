package com.popebp.bitcoin.exchange.btce;
// TODO: This could probably be even shorter than it currently is...
public enum Currency {
	USD("usd"), // United States Dollar
	RUR("rur"), // Russian Ruble
	EUR("eur"), // Europe's Euro
	BTC("btc"), // Bitcoin
	LTC("ltc"), // Litecoin
	NMC("nmc"), // Namecoin
	NVC("nvc"), // Novacoin
	TRC("trc"), // Terracoin
	PPC("ppc"), // PeerCoin
	FTC("ftc"), // FeatherCoin
	XPM("xpm"); // PrimeCoin
	
	private final String shorthand;
	
	Currency(String text) {
		this.shorthand = text;
	}
	
	@Override
	public String toString() {
		return this.shorthand;
	}
}
