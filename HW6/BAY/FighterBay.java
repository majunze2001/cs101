package ma.BAY;

import java.util.TreeSet;

import ma.TIEFIGHTER.TieFighter;

public abstract class FighterBay extends Bay {
	private TreeSet<TieFighter> Slots;
	
	public FighterBay() {
	}
	
	public FighterBay(String Bayname,String BayID) {
		this.setBayName(Bayname);
		this.setBayID(BayID);
	}
	
	
	public TreeSet<TieFighter> getSlots() {
		return Slots;
	}

	public void setSlots(TreeSet<TieFighter> slots) {
		Slots = slots;
	}

	public abstract void displayTieFighters();
	

}
