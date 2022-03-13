package ma.DECK;

public class Bridge extends ShipDeck {
	
	public Bridge(String StarDestroyerType) {
		this.setDeckType("Bridge");
		if (StarDestroyerType.equals("Imperial_I")) {
			this.setLength(150);
			this.setHeight(20);
			this.setWidth(100);
			this.setWeight(75);
		}
		if (StarDestroyerType.equals("Imperial_II")) {
			this.setLength(200);
			this.setHeight(22);
			this.setWidth(150);
			this.setWeight(100);
		}
	}

}
