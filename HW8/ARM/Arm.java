package ma.ARM;

public abstract class Arm {
	private String IDNumber;
	private String AType;
	
	public Arm(String iDNumber, String aType) {
		super();
		IDNumber = iDNumber;
		AType = aType;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getAType() {
		return AType;
	}

	public void setAType(String aType) {
		AType = aType;
	}
	
	
	@Override
	public String toString() {
		return AType + ": " + IDNumber;
	}

	public void displayInfo() {
		System.out.println(this.toString());
	}
	

}
