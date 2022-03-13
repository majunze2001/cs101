package ma.LEG;

public abstract class Leg {
	private String IDNumber;
	private String LType;

	public Leg(String iDNumber, String aType) {
		super();
		IDNumber = iDNumber;
		LType = aType;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getLType() {
		return LType;
	}

	public void setAType(String aType) {
		LType = aType;
	}

	@Override
	public String toString() {
		return LType + ": " + IDNumber;
	}

	public void displayInfo() {
		System.out.println(this.toString());
	}

}
