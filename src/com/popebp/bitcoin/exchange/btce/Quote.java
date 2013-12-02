package com.popebp.bitcoin.exchange.btce;

import android.net.Uri;

public class Quote {
	
	public static final Integer API_VERSION = 2;
	public static final String API_URL = "https://btc-e.com/api/";
	
	// TODO: This will do all the RESTful queries to the QUOTE Api for BTC-e
	
	// Order of currency matters
	// https://btc-e.com/api/2/<curr>_<curr>/ticker
	
	private static String createQuoteUrl(CurrencyPair pair) {
		
		Uri uri = Uri.parse(API_URL);
		
		Uri.Builder builder = uri.buildUpon();
		
		builder.appendPath(API_VERSION.toString());
		builder.appendPath(pair.toString());
		builder.appendPath("ticker");
		
		return builder.toString();
	}
}