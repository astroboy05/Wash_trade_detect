package wash.pojo;

public class brokers {
	
	//data members
	private int brokerID;
	private String name;
	
	//Default constructor
	public brokers() {
		
	}
	
	//parameterized constructor
	public brokers(int brokerID, String name)
	{
		
		this.brokerID=brokerID;
		this.name=name;
	}
	
	
	//getters and setters
	public int getBrokerID() {
		return brokerID;
	}
	public void setBrokerID(int brokerID) {
		this.brokerID = brokerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
