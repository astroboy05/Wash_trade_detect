package wash.pojo;

public class tradelogs {
	
	//Data members
	private int washID;
	private int tradeID;
	
	//default constructor
	public tradelogs() {
		
	}
	
	
	
	//Parameterized constructor
	public tradelogs(int washID,int tradeID) {
		this.washID=washID;
		this.tradeID=tradeID;
	}
	
	//getters and setters
	public int getWashID() {
		return washID;
	}
	public void setWashID(int washID) {
		this.washID = washID;
	}
	public int getTradeID() {
		return tradeID;
	}
	public void setTradeID(int tradeID) {
		this.tradeID = tradeID;
	}

	

}
