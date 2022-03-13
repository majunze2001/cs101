package ma.BAY;

public class FBay extends FighterBay {
	private int Capacity;

	public FBay(String Bayname, String BayID) {
		super(Bayname, BayID);
		this.setBayType("“Tie Fighter P");
		Capacity = 96;
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
