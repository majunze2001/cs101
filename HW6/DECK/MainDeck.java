package ma.DECK;

public class MainDeck extends ShipDeck {
	
	public MainDeck(String StarDestroyerType) {
		this.setDeckType("Main Deck");
		if (StarDestroyerType.equals("Imperial_I")) {
			this.setLength(600);
			this.setHeight(50);
			this.setWidth(400);
			this.setWeight(250);
		}
		if (StarDestroyerType.equals("Imperial_II")) {
			this.setLength(700);
			this.setHeight(56);
			this.setWidth(450);
			this.setWeight(300);
		}
	}


}
