package ma.MAIN;

import ma.SUPPORT.TiePilot;
import ma.TIE.TieBomber;
import ma.TIE.TieFighter;

public class Ma_HW5 {

	public static void main(String[] args) {
			TiePilot tp1 = new TiePilot("TP-001", "LT" , "Elite");
			TiePilot tp2 = new TiePilot("TP-002", "CAPT", "Elite");
			TiePilot tp3 = new TiePilot("TP-003", "LT", "Veteran");

			TiePilot[] TPs = {tp2,tp3};
			
			TieFighter TF = new TieFighter("TF-1",tp1);
			TF.getPilot().displayinfo();
			System.out.println();
			TieBomber TB= new TieBomber("TB-1");
			
			TB.setPilots(TPs);
			
			TB.displayBomberData();
			System.out.println();
			TF.displayFighterData();
			
			System.out.println();
			TF.firesCannons();
			System.out.println();
			TB.dropBombs();
			System.out.println();
			TB.dropBombs();
			

	}

}
