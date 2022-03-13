package ma.DECK;

public class TopDeck extends ShipDeck {
	
	public TopDeck(String StarDestroyerType) {
		this.setDeckType("Top Deck");
		if (StarDestroyerType.equals("Imperial_I")) {
			this.setLength(300);
			this.setHeight(30);
			this.setWidth(250);
			this.setWeight(125);
		}
		if (StarDestroyerType.equals("Imperial_II")) {
			this.setLength(350);
			this.setHeight(34);
			this.setWidth(300);
			this.setWeight(150);
		}
	}


}
