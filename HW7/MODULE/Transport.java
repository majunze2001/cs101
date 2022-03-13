package ma.MODULE;

import java.util.ArrayList;

import ma.ENUMS.AccessRamp;
import ma.ENUMS.Stormtrooper;

public class Transport extends Module {

	private AccessRamp ramp;
	private ArrayList<Stormtrooper> troops;

	public Transport(String walkerType) {
		super("Transport");
		this.setLength(15);
		this.setHeight(8);
		this.setWidth(5);
		this.setMass(17);
		this.troops = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			troops.add(Stormtrooper.Assault);
			troops.add(Stormtrooper.Scout);
			troops.add(Stormtrooper.Standard);
		}
		for (int i = 0; i < 7; i++) {
			troops.add(Stormtrooper.Standard);
		}
	}

	public AccessRamp getRamp() {
		return ramp;
	}

	public void setRamp(AccessRamp ramp) {
		this.ramp = ramp;
	}

	public ArrayList<Stormtrooper> getTroops() {
		return troops;
	}

	public void setTroops(ArrayList<Stormtrooper> troops) {
		this.troops = troops;
	}

	@Override
	public void showSpecs() {
		System.out.println("Troop Capacity: ");
		System.out.println("\tTroops Onboard: " + this.getTroops().size() + " troopers");
	}

	public boolean openDoor() {
		return true;
	}

	public boolean closeDoor() {
		return true;
	}
}
