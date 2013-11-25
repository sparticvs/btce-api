package com.popebp.bitcoin.exchange.btce;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.math.BigDecimal;

public class ResultFactory {
	
	private Map<Currency, BigDecimal> jsonFundsToList(JSONObject obj) {
		
		Map<Currency, BigDecimal> funds = new HashMap<Currency, BigDecimal>();
		
		
		
		//funds.put(CurrencyFactory.parseCurrency(currency), value)
		
		return funds;
	}
	
	// Pass in the object under "return"
	public static Result createGetInfoResultFromJSON(JSONObject jsonObj) {
		GetInfoResult result = new GetInfoResult();
		
		try {
			
		} catch (JSONException ex) {
			
		}
		
		JSONObject funds = jsonObj.getJSONObject("funds");
		JSONObject rights = jsonObj.getJSONObject("rights");
		
		return new GetInfoResult();
	}
}
