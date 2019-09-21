package wash.pojo;

import wash.functions.DateAndTime;

public class tradeBook {

	// Data member declaration
	private int tradeID;
	private String tradeType;
	private DateAndTime timestamp;
	private int SymID;
	private String SecType;
	private double vol;
	private float price;
	private float strike;
	private int traderID;
	private int brokerID;
	
	
	//Default Constructor
	public tradeBook() {
		
	}
	
	//Parameterized constructor
	public tradeBook(int tradeID,String tradeType,int SymID,String SecType,double vol,float price,float strike,int traderID,int brokerID,DateAndTime timestamp) {
		this.tradeID=tradeID;
		this.tradeType=tradeType;
		this.SymID=SymID;
		this.SecType=SecType;
		this.vol=vol;
		this.price=price;
		this.strike=strike;
		this.traderID=traderID;
		this.brokerID=brokerID;
		this.timestamp=this.timestamp;
	}

	
	// getters and setters
	public DateAndTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(DateAndTime timestamp) {
		this.timestamp = timestamp;
	}

	public int getTradeID() {
		return tradeID;
	}

	public void setTradeID(int tradeID) {
		this.tradeID = tradeID;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public int getSymID() {
		return SymID;
	}

	public void setSymID(int symID) {
		SymID = symID;
	}

	public String getSecType() {
		return SecType;
	}

	public void setSecType(String secType) {
		SecType = secType;
	}

	public double getVol() {
		return vol;
	}

	public void setVol(double vol) {
		this.vol = vol;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getStrike() {
		return strike;
	}

	public void setStrike(float strike) {
		this.strike = strike;
	}

	public int getTraderID() {
		return traderID;
	}

	public void setTraderID(int traderID) {
		this.traderID = traderID;
	}

	public int getBrokerID() {
		return brokerID;
	}

	public void setBrokerID(int brokerID) {
		this.brokerID = brokerID;
	}
	
	
	
	
	
}
