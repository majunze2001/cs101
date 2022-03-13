package ma.DECK;

public class Deck {

	private String IDNumber;
	private Bridge Deck_Bridge;
	private TopDeck Deck_Top;
	private MainDeck Deck_Main;

	public Deck(String IDNumber, String StarDestroyerType) {
		this.IDNumber = IDNumber;
		this.Deck_Bridge = new Bridge(StarDestroyerType);
		this.Deck_Top = new TopDeck(StarDestroyerType);
		this.Deck_Main = new MainDeck(StarDestroyerType);
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public Bridge getDeck_Bridge() {
		return Deck_Bridge;
	}

	public void setDeck_Bridge(Bridge deck_Bridge) {
		Deck_Bridge = deck_Bridge;
	}

	public TopDeck getDeck_Top() {
		return Deck_Top;
	}

	public void setDeck_Top(TopDeck deck_Top) {
		Deck_Top = deck_Top;
	}

	public MainDeck getDeck_Main() {
		return Deck_Main;
	}

	public void setDeck_Main(MainDeck deck_Main) {
		Deck_Main = deck_Main;
	}

	@Override
	public String toString() {
		return "Deck [IDNumber=" + IDNumber + ", Deck_Bridge=" + Deck_Bridge + ", Deck_Top=" + Deck_Top + ", Deck_Main="
				+ Deck_Main + "]";
	}

	public void displayDeckSpecs() {
		System.out.println("________DECK SPECIFICATIONS");
		System.out.println("Deck Number: " + this.IDNumber);
		System.out.println("\t\t\tLength\tHeight\tWidth\tWeight");
		System.out.println("BRIDGE:\t\t\t" + this.Deck_Bridge.DeckInfo());
		System.out.println("TOP DECK:\t\t" + this.Deck_Top.DeckInfo());
		System.out.println("MAIN DECK:\t\t" + this.Deck_Main.DeckInfo());
		
	}

}
