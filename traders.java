package wash.pojo;


public class traders {

	
	//data members
	private int traderID;
	private String name;
	private String soeID;
	
	
	//default constructor
	public traders() {
		
	}
	
	//Parameterized constructor
	public traders(int traderID,String name,String soeID) {
		this.traderID=traderID;
		this.name=name;
		this.soeID=soeID;
	}

	
	//getters and setters
	public int getTraderID() {
		return traderID;
	}

	public void setTraderID(int traderID) {
		this.traderID = traderID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoeID() {
		return soeID;
	}

	public void setSoeID(String soeID) {
		this.soeID = soeID;
	}
	
	
	
	
	
}
