package ma.ENUMS;

import ma.INTERFACES.Specifiable;

public enum DarkEyeDroid implements Specifiable{
	DE_1("ID","Dark_Eye Type 1",50),
	DE_2("ID","Dark_Eye Type 2",80);
	
	private String idNumber;
	private String type;
	private int cost;
	
	private DarkEyeDroid(String idNumber, String type, int cost) {
		this.idNumber = idNumber;
		this.type = type;
		this.cost = cost;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	

}
