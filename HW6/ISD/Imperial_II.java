package ma.ISD;

import ma.DECK.Deck;
import ma.ENGINE.Engine;
import ma.HULL.Hull;

public class Imperial_II extends StarDestroyer {

	public Imperial_II() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Imperial_II(String shpNumber, String shpName) {
		super(shpNumber, shpName);
		this.setShpClass("Imperial_II");
		this.setShpCrew(12000);
		this.setShpHulls(new Hull("H1", this.getShpClass()));
		this.setShpDecks(new Deck("D1", this.getShpClass()));
		this.setShpEngines(new Engine("E1", this.getShpClass()));
	}

	@Override
	public void naviagtesToPosition(String p) {
		// TODO Auto-generated method stub

	}

}
