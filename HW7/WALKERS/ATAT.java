package ma.WALKERS;

import java.util.ArrayList;

import ma.ENUMS.Stormtrooper;
import ma.MODULE.Command;
import ma.MODULE.Transport;
import ma.SUPPORT.Position;
import ma.SUPPORT.Target;

public class ATAT extends ImperialWalker {

	private String ATATBattleCode;

	public ATAT(String idNumber) {
		super("ATAT", idNumber);
		this.setCmdModule(new Command(this.getType()));
		this.setCargoModule(new Transport(this.getType()));
		this.setLength(20);
		this.setWidth(5);
		this.setHeight(16);
		this.setMass(46);
		this.ATATBattleCode = "Heavy_AT";
	}

	public String getATATBattleCode() {
		return ATATBattleCode;
	}

	public void setATATBattleCode(String aTATBattleCode) {
		ATATBattleCode = aTATBattleCode;
	}

	@Override
	public void moveToPosition(Position P) {
		this.setCurrentPosition(P);
	}

	@Override
	public void embarkTroopers(ArrayList<Stormtrooper> S) {
		this.getCargoModule().setTroops(S);
		System.out.println(S.size() + " Stormtrooper Onboard");
	}

	@Override
	public void disembarkTroopers() {
		this.getCargoModule().getTroops().clear();
		System.out.println("All Stormtroopers offload");
	}

	public void rollCall() {
		System.out.println(this.getCargoModule().getTroops().size() + " Stormtroopers currently onboard");
	}

	public void fireLaserCannons(Target T) {
		this.getCmdModule().getLeftWpns().fireCannon(T);
		this.getCmdModule().getRightWpns().fireCannon(T);
	}

	public void fireHeavyBlasters(Target T) {
		this.getCmdModule().getLeftWpns().fireBlaster(T);
		this.getCmdModule().getRightWpns().fireBlaster(T);
	}

	@Override
	public void assaultPosition(Position P) {
		this.moveToPosition(P);
		System.out.println("Asssulting: " + this.getCurrentPosition().getLoc().toString());


	}

	@Override
	public void displayWalkerSpecs() {
		System.out.println("IMPERIAL WALKER: " + this.getType() + " ID Number: " + this.getIdNumber()); 
		this.getCurrentPosition().displayPosition();
		
		System.out.println("Specifications:");
		System.out.println("\tLength: " + this.getLength() + " meters");
		System.out.println("\tWidth: " + this.getWidth() + " meters");
		System.out.println("\tHeight: " + this.getHeight() + " meters");
		System.out.println("\tMass: " + this.getMass() + " tons");
		
		this.getCargoModule().showSpecs();
		this.getCmdModule().showSpecs();
		this.getCmdModule().showCrew();
		System.out.println();
		this.getAftLeg().get("Right").showSpecs();
		this.getFwdLeg().get("Left").showSpecs();
	}

}
