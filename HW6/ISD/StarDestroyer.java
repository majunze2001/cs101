package ma.ISD;

import java.text.DecimalFormat;

import ma.DECK.Deck;
import ma.ENGINE.Engine;
import ma.HULL.Hull;
import ma.INTERFACES.Maneuvers;

public abstract class StarDestroyer implements Maneuvers {
	private String ShpNumber;
	private String ShpType;
	private String ShpName;
	private String ShpClass;
	private int ShpCrew;
	private Hull ShpHulls;
	private Deck ShpDecks;
	private Engine ShpEngines;

	public StarDestroyer() {

	}

	public StarDestroyer(String shpNumber, String shpName) {
		ShpNumber = shpNumber;
		ShpType = "Star Destroyer";
		ShpName = shpName;

	}

	public String getShpNumber() {
		return ShpNumber;
	}

	public void setShpNumber(String shpNumber) {
		ShpNumber = shpNumber;
	}

	public String getShpType() {
		return ShpType;
	}

	public void setShpType(String shpType) {
		ShpType = shpType;
	}

	public String getShpName() {
		return ShpName;
	}

	public void setShpName(String shpName) {
		ShpName = shpName;
	}

	public String getShpClass() {
		return ShpClass;
	}

	public void setShpClass(String shpClass) {
		ShpClass = shpClass;
	}

	public int getShpCrew() {
		return ShpCrew;
	}

	public void setShpCrew(int shpCrew) {
		ShpCrew = shpCrew;
	}

	public Hull getShpHulls() {
		return ShpHulls;
	}

	public void setShpHulls(Hull shpHulls) {
		ShpHulls = shpHulls;
	}

	public Deck getShpDecks() {
		return ShpDecks;
	}

	public void setShpDecks(Deck shpDecks) {
		ShpDecks = shpDecks;
	}

	public Engine getShpEngines() {
		return ShpEngines;
	}

	public void setShpEngines(Engine shpEngines) {
		ShpEngines = shpEngines;
	}

	public void displayShipInfo() {
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("________IMPERIAL SATR DESTROYER " + this.ShpName);
		System.out.println("Ship Number " + this.ShpNumber);
		System.out.println("Ship Class " + this.ShpClass);
		System.out.println("Crew:  " + df.format(this.ShpCrew));
		//System.out.println();
		//this.ShpHulls.displayHullSpecs();
		//System.out.println();
		//this.ShpDecks.displayDeckSpecs();
		//System.out.println();
		//this.ShpEngines.displayEngineSpecs();
	}
	
}
