package ma.ARMAMENT;

public class LaserCannon {
	
	private int maxRange;
	private int ammoCapacity;
	private int currentAmmo;
	
	public LaserCannon() {
		this.maxRange = 80;
		this.ammoCapacity = 5;
		this.currentAmmo = this.ammoCapacity;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getAmmoCapacity() {
		return ammoCapacity;
	}

	public void setAmmoCapacity(int ammoCapacity) {
		this.ammoCapacity = ammoCapacity;
	}

	public int getCurrentAmmo() {
		return currentAmmo;
	}

	public void setCurrentAmmo(int currentAmmo) {
		this.currentAmmo = currentAmmo;
	}
	
	public boolean fire() {
		if (this.currentAmmo < 1) {
			System.out.println("Ammunition Expended");
			return false;
		}
		System.out.println("Firing Laser Cannon*");
		this.currentAmmo--;
		return true;
		
		/*if (this.currentAmmo >= 1) {
			System.out.println("Firing Laser Cannon*");
			this.currentAmmo--;
			return true;

		}else {
			System.out.println("Ammunition Expended");
			return false;
		}*/
	}
	
	public boolean rapidFire() {
		
		if (this.currentAmmo < 3) {
			System.out.println("Ammunition Expended");
			return false;
		}
		System.out.println("Firing Laser Cannon***");
		this.currentAmmo -= 3;
		return true;
		
		/*if (this.currentAmmo >= 3) {
			System.out.println("Firing Laser Cannon***");
			this.currentAmmo--;
			return true;
		}else {
			System.out.println("Ammunition Expended");
			return false;
		}*/
	}
	
	public boolean reload() {
		//System.out.println("Reloading...");
		this.currentAmmo = this.ammoCapacity;
		return true;
	}
	
	
	

	
	
}
