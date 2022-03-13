package ma.ARMAMENT;


import ma.SUPPORT.Target;

public class WeaponPlatform {

	private String type;
	private LaserCannon laser;
	private HeavyBlaster blaster;

	public WeaponPlatform(String type) {
		this.type = type;
		this.laser = new LaserCannon();
		this.blaster = new HeavyBlaster();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LaserCannon getLaser() {
		return laser;
	}

	public void setLaser(LaserCannon laser) {
		this.laser = laser;
	}

	public HeavyBlaster getBlaster() {
		return blaster;
	}

	public void setBlaster(HeavyBlaster blaster) {
		this.blaster = blaster;
	}
	
	public void fireCannon(Target T) {
		this.laser.fire();
	}
	
	public void fireBlaster(Target T) {
		this.blaster.fire();
	}
	
	
	

}
