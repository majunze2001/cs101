package ma.MODULE;

import ma.ARMAMENT.WeaponPlatform;
import ma.ENUMS.Crewman;

public class Command extends Module {

	private WeaponPlatform LeftWpns;
	private WeaponPlatform RightWpns;
	private Crewman driver;
	private Crewman cmdr;
	private Crewman gunner;

	public Command(String walkerType) {
		super("Command");
		this.setLength(5);
		this.setHeight(4);
		this.setWidth(4);
		this.setMass(5);
		this.LeftWpns = new WeaponPlatform(walkerType);
		this.RightWpns = new WeaponPlatform(walkerType);
		this.driver = Crewman.Driver;
		this.cmdr = Crewman.Commander;
		this.gunner = Crewman.Gunner;
	}

	public WeaponPlatform getLeftWpns() {
		return LeftWpns;
	}

	public void setLeftWpns(WeaponPlatform leftWpns) {
		LeftWpns = leftWpns;
	}

	public WeaponPlatform getRightWpns() {
		return RightWpns;
	}

	public void setRightWpns(WeaponPlatform rightWpns) {
		RightWpns = rightWpns;
	}

	public Crewman getDriver() {
		return driver;
	}

	public void setDriver(Crewman driver) {
		this.driver = driver;
	}

	public Crewman getCmdr() {
		return cmdr;
	}

	public void setCmdr(Crewman cmdr) {
		this.cmdr = cmdr;
	}

	public Crewman getGunner() {
		return gunner;
	}

	public void setGunner(Crewman gunner) {
		this.gunner = gunner;
	}

	@Override
	public void showSpecs() {
		System.out.println("Armament:");
		System.out.println("\tLeft:\t" + this.getLeftWpns().getLaser().getClass());
		System.out.println("\tLeft:\t" + this.getLeftWpns().getBlaster().getClass());
		System.out.println("\tRight:\t" + this.getRightWpns().getLaser().getClass());
		System.out.println("\tRight:\t" + this.getLeftWpns().getBlaster().getClass());
	}

	public void showCrew() {
		System.out.println("Crew:\t");
		System.out.print(this.getCmdr().getType() + ", "
				+ this.getDriver().getType() + ", "
				+ this.getGunner().getType());

	}

}
