package wash.pojo;

public class washTrades {

	
	//data members
	private int washTrades;
	private double priceMargin;
	private double volumeMargin;
	private int traderID;
	private int brokerID;
	private int symbolID;
	
	//default constructor
	public washTrades() {
		
	}
	
	
	//Parameterized constructor
	public washTrades(int washTrades,double priceMargin,double volumeMargin,int traderID,int brokerID,int symbolID) {
		this.washTrades=washTrades;
		this.priceMargin=priceMargin;
		this.volumeMargin=volumeMargin;
		this.traderID=traderID;
		this.brokerID=brokerID;
		this.symbolID=symbolID;
	}


	
	//getters and setters
	
	public int getWashTrades() {
		return washTrades;
	}


	public void setWashTrades(int washTrades) {
		this.washTrades = washTrades;
	}


	public double getPriceMargin() {
		return priceMargin;
	}


	public void setPriceMargin(double priceMargin) {
		this.priceMargin = priceMargin;
	}


	public double getVolumeMargin() {
		return volumeMargin;
	}


	public void setVolumeMargin(double volumeMargin) {
		this.volumeMargin = volumeMargin;
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


	public int getSymbolID() {
		return symbolID;
	}


	public void setSymbolID(int symbolID) {
		this.symbolID = symbolID;
	}
	
	
}
