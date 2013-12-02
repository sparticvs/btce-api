package com.popebp.bitcoin.exchange.btce;

import org.json.JSONObject;

import android.net.Uri;

public class BTCe {
	public static final String API_URL = "https://btc-e.com/tapi";
	private String apiKey = null;
	private String apiSecret = null;
	
	/*
	 * Needs
	 *  o Method that builds the QueryParams and signs
	 *  o Method that builds the Headers
	 *  o Method that takes in api path, query params, headers and makes request (returns JSONObject)
	 *  o ResultFactory that builds each result type
	 */
	
	public BTCe(String key, String secret) {
		this.apiKey = key;
		this.apiSecret = secret;
	}
	
	private JSONObject doRequest() {
		// TODO: This will make the request, based on the endpoint
		
		return null;
	}
	
	public Result getInfo() {
		String uri = BTCe.buildTradeUrl("getInfo");
		return new GetInfoResult();
	}
	
	public Result getTransactionHistory(Parameters params) {
		String uri = BTCe.buildTradeUrl("TransHistory");
		return new TransactionHistoryResult();
	}
	
	public Result getTradeHistory(Parameters params) {
		String uri = BTCe.buildTradeUrl("TradeHistory");
		return new TradeHistoryResult();
	}
	
	public Result getActiveOrders(Parameters params) {
		String uri = BTCe.buildTradeUrl("ActiveOrders");
		return new ActiveOrdersResult();
	}
	
	public Result doTrade(Parameters params) {
		String uri = BTCe.buildTradeUrl("Trade");
		return new TradeResult();
	}
	
	public Result doCancelOrder(Parameters params) {
		String uri = BTCe.buildTradeUrl("CancelOrder");
		return new CancelOrderResult();
	}
	
	private static String buildTradeUrl(String action) {
		
		Uri uri = Uri.parse(API_URL);
		
		Uri.Builder builder = uri.buildUpon();
		builder.appendPath(action);
		
		return builder.toString();
	}
}
