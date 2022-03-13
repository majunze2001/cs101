package ma.PART1;

public class Scouttrooper extends Stormtrooper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Type;

	public Scouttrooper(String iDNumber, String sTID) {
		super(iDNumber, sTID);
		this.Type = "Scout";
	}

	
	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}



	@Override
	public void displayTrooper() {
		System.out.println("I am a " + this.Type + "trooper");
		System.out.println("My ID Number is " + this.getIDNumber());
		System.out.println("My STID is " + this.getSTID());

	}

}
