package ma.PART1;

import java.io.Serializable;

public abstract class ImperialTrooper implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String IDNumber;

	public ImperialTrooper(String iDNumber) {
		super();
		IDNumber = iDNumber;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	
	
}
