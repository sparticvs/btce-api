package com.popebp.bitcoin.exchange.btce;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.popebp.exception.InvalidResultException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ResultFactory {
	
	public static Map<Currency, BigDecimal> createCurrencyMap(JSONObject obj) throws JSONException {
		
		Map<Currency, BigDecimal> funds = new HashMap<Currency, BigDecimal>();
		
		for(Iterator<?> keyItr = obj.keys(); keyItr.hasNext();) {
			String currency = keyItr.next().toString();
			funds.put(CurrencyFactory.parseCurrency(currency), BigDecimal.valueOf(obj.getDouble(currency)));
		}
		
		return funds;
	}
	
	public static Rights createRights(JSONObject obj) throws InvalidResultException {
		Rights rights = new Rights();
		try {
			rights.setInfo(obj.getBoolean("info"));
			rights.setTrade(obj.getBoolean("trade"));
		} catch (JSONException ex) {
			throw new InvalidResultException(ex.getMessage());
		}
		return rights;
	}
	
	public static Result createGetInfoResult(JSONObject obj) throws InvalidResultException {
		GetInfoResult result = new GetInfoResult();
		
		try {
			result.setFunds(ResultFactory.createCurrencyMap(obj.getJSONObject("funds")));
			result.setRights(ResultFactory.createRights(obj.getJSONObject("rights")));
			result.setTransactionCount(BigInteger.valueOf(obj.getLong("transaction_count")));
			result.setOpenOrders(BigInteger.valueOf(obj.getLong("open_orders")));
			result.setServerTime(BigInteger.valueOf(obj.getLong("server_time")));
		} catch (JSONException ex) {
			throw new InvalidResultException(ex.getMessage());
		}
		
		return result;
	}
	
	public static Result createTransactionHistoryResult(JSONObject obj) throws InvalidResultException {
		TransactionHistoryResult result = new TransactionHistoryResult();
		
		JSONArray transactionNames = obj.names();
							
		try {
			if(transactionNames.length() != 1) {
				// Throw exception pertaining to length
				return null;
			} else {
				result.setTransactionId(BigInteger.valueOf(transactionNames.getLong(0)));
			}
			
			JSONObject subObj = obj.getJSONObject(transactionNames.getString(0));
			
			result.setAmount(BigDecimal.valueOf(subObj.getDouble("amount")));
			result.setCurrency(CurrencyFactory.parseCurrency(subObj.getString("currency")));
			result.setDescription(subObj.getString("desc"));
			result.setStatus(TransactionStatus.valueOf(subObj.getString("status")));
			result.setTimestamp(BigInteger.valueOf(subObj.getLong("timestamp")));
			result.setType(TradeType.valueOf(subObj.getString("type")));
		} catch (JSONException ex) {
			throw new InvalidResultException(ex.getMessage());
		}
		
		return result;
	}
	
	public static Result createTradeHistoryResult(JSONObject obj) throws InvalidResultException {
		TradeHistoryResult result = new TradeHistoryResult();
		
		JSONArray tradeNames = obj.names();
			
		try {
			if(tradeNames.length() != 1) {
				// Throw exception pertaining to length
				return null;
			} else {
				result.setTradeId(BigInteger.valueOf(tradeNames.getLong(0)));
			}
			
			JSONObject subObj = obj.getJSONObject(tradeNames.getString(0));
			
			result.setAmount(BigDecimal.valueOf(subObj.getDouble("amount")));
			result.setPair(CurrencyPairFactory.parsePair(subObj.getString("pair")));
			result.setType(TradeType.valueOf(subObj.getString("type")));
			result.setRate(BigDecimal.valueOf(subObj.getDouble("rate")));
			result.setTimestamp(BigInteger.valueOf(subObj.getLong("timestamp")));
			result.setOrderId(BigInteger.valueOf(subObj.getLong("order_id")));
			result.setYourOrder(subObj.getBoolean("is_your_order"));
			
		} catch (JSONException ex) {
			throw new InvalidResultException(ex.getMessage());
		}
		
		return result;
	}
	
	public static Result createActiveOrdersResult(JSONObject obj) throws InvalidResultException {
		ActiveOrdersResult result = new ActiveOrdersResult();
		
		JSONArray orderNames = obj.names();
		
		try {
			if(orderNames.length() != 1) {
				// TODO: Throw exception pertaining to length
				return null;
			} else { 
				result.setOrderId(BigInteger.valueOf(orderNames.getLong(0)));
			}
			
			JSONObject subObj = obj.getJSONObject(orderNames.getString(0));
			
			result.setAmount(BigDecimal.valueOf(subObj.getDouble("amount")));
			result.setPair(CurrencyPairFactory.parsePair(subObj.getString("pair")));
			result.setType(TradeType.valueOf(subObj.getString("type")));
			result.setRate(BigDecimal.valueOf(subObj.getDouble("rate")));
			result.setTimestampCreated(BigInteger.valueOf(subObj.getLong("timestamp_created")));
			result.setStatus(TransactionStatus.valueOf(subObj.getString("status")));
		} catch (JSONException ex) {
			throw new InvalidResultException(ex.getMessage());
		}
		
		return result;
	}
	
	public static Result createTradeResult(JSONObject obj) throws InvalidResultException {
		TradeResult result = new TradeResult();
		
		try {
			result.setReceived(BigDecimal.valueOf(obj.getDouble("received")));
			result.setRemains(BigDecimal.valueOf(obj.getDouble("remains")));
			result.setOrderId(BigInteger.valueOf(obj.getLong("order_id")));
			result.setFunds(ResultFactory.createCurrencyMap(obj.getJSONObject("funds")));
		} catch (JSONException ex) {
			throw new InvalidResultException(ex.getMessage());
		}
		
		return result;
	}
	
	public static Result createCancelOrderResult(JSONObject obj) throws InvalidResultException {
		CancelOrderResult result = new CancelOrderResult();
		
		try {
			result.setFunds(ResultFactory.createCurrencyMap(obj.getJSONObject("funds")));
			result.setOrderId(BigInteger.valueOf(obj.getLong("order_id")));
		} catch (JSONException ex) {
			throw new InvalidResultException(ex.getMessage());
		}
		
		return result;
	}
}
