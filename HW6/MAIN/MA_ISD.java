package ma.MAIN;

import ma.ISD.Imperial_I;
import ma.ISD.Imperial_II;

public class MA_ISD {

	public static void main(String[] args) {
		Imperial_I ISD1 = new Imperial_I("ISD-001", "Avenger");
		Imperial_II ISD2 = new Imperial_II("ISD-002", "Devastator");
		
		ISD1.displayShipInfo();
		System.out.println();
		ISD1.getShpHulls().displayHullSpecs();
		System.out.println();
		ISD1.getShpDecks().displayDeckSpecs();
		System.out.println();
		ISD1.getShpEngines().displayEngineSpecs();
		System.out.println();
		
		System.out.println();
		ISD2.displayShipInfo();
		System.out.println();
		ISD2.getShpHulls().displayHullSpecs();
		System.out.println();
		ISD2.getShpDecks().displayDeckSpecs();
		System.out.println();
		ISD2.getShpEngines().displayEngineSpecs();

	}

}
