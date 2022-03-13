package ma.BAY;

public class PBay extends FighterBay {

	private int Capacity;

	public PBay(String Bayname, String BayID) {
		super(Bayname, BayID);
		this.setBayType("“Tie Fighter P");
		Capacity = 48;
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
