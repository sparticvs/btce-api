package com.popebp.bitcoin.exchange.btce;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ResultFactory {
	
	private static Map<Currency, BigDecimal> jsonFundsToList(JSONObject obj) throws JSONException {
		
		Map<Currency, BigDecimal> funds = new HashMap<Currency, BigDecimal>();
		
		for(Iterator<String> keyItr = obj.keys(); keyItr.hasNext();) {
			String currency = keyItr.next();
			funds.put(CurrencyFactory.parseCurrency(currency), BigDecimal.valueOf(obj.getDouble(currency)));
		}
		
		return funds;
	}
	
	public static Rights createRights(JSONObject obj) {
		Rights rights = new Rights();
		try {
			rights.setInfo(obj.getBoolean("info"));
			rights.setTrade(obj.getBoolean("trade"));
		} catch (JSONException ex) {
			// TODO: throw a 'InvalidResultException'
		}
		return rights;
	}
	
	public static Result createGetInfoResult(JSONObject obj) {
		GetInfoResult result = new GetInfoResult();
		
		try {
			result.setFunds(ResultFactory.jsonFundsToList(obj.getJSONObject("funds")));
			result.setRights(ResultFactory.createRights(obj.getJSONObject("rights")));
			result.setTransactionCount(BigInteger.valueOf(obj.getLong("transaction_count")));
			result.setOpenOrders(BigInteger.valueOf(obj.getLong("open_orders")));
			result.setServerTime(BigInteger.valueOf(obj.getLong("server_time")));
		} catch (JSONException ex) {
			// TODO: throw a 'InvalidResultException'
		}
		
		return result;
	}
	
	public static Result createTransactionHistoryResult(JSONObject obj) {
		TransactionHistoryResult result = new TransactionHistoryResult();
		
		JSONArray transactionNames = obj.names();
							
		try {
			if(transactionNames.length() != 1) {
				// Throw exception pertaining to length
				return null;
			} else {
				result.setTransactionId(BigInteger.valueOf(transactionNames.getInt(0)));
			}
			
			JSONObject subObj = obj.getJSONObject(transactionNames.getString(0));
			
			result.setAmount(BigDecimal.valueOf(subObj.getDouble("amount")));
			result.setCurrency(CurrencyFactory.parseCurrency(subObj.getString("currency")));
			result.setDescription(subObj.getString("desc"));
			result.setStatus(TransactionStatus.valueOf(subObj.getString("status")));
			result.setTimestamp(BigInteger.valueOf(subObj.getLong("timestamp")));
			result.setType(TradeType.valueOf(subObj.getString("type")));
		} catch (JSONException ex) {
			// TODO: throw a 'InvalidResultException'
		}
		
		return result;
	}
}
