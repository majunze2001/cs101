package ma.BAY;

public class SBay extends FighterBay {
	private int Capacity;

	public SBay(String Bayname, String BayID) {
		super(Bayname, BayID);
		this.setBayType("“Tie Fighter S");
		Capacity = 36;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	@Override
	public void displayTieFighters() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayBayInfo() {
		// TODO Auto-generated method stub

	}
}
