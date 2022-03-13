package ma.PART1;

public abstract class Stormtrooper extends ImperialTrooper implements Tactical{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String STID;

	public Stormtrooper(String iDNumber, String sTID) {
		super(iDNumber);
		STID = sTID;
	}

	public String getSTID() {
		return STID;
	}

	public void setSTID(String sTID) {
		STID = sTID;
	}
	
	public abstract void displayTrooper();
	
	@Override
	public void move() {
		System.out.println(this.getIDNumber() + " is moving");
	}
	
}
