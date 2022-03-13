package ma.BODY;

public abstract class Body {
	private String IDNumber;
	private String BType;
	
	public Body(String iDNumber, String bType) {
		super();
		IDNumber = iDNumber;
		BType = bType;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getBType() {
		return BType;
	}

	public void setBType(String bType) {
		BType = bType;
	}
	
	
	@Override
	public String toString() {
		return BType + ", " + "IDNumber: " + IDNumber; 
	}

	public void displayInfo() {
		System.out.println(this.toString());
	}

}
