package ma.ARMAMENT;

public class HeavyBlaster {

	private int maxRange;
	private int minRange;
	private int ammoCapacity;
	private int currentAmmo;

	public HeavyBlaster() {
		this.maxRange = 30;
		this.minRange = 10;
		this.ammoCapacity = 1;
		this.currentAmmo = this.ammoCapacity;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
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
		System.out.println("Firing Heavy Blaster");
		this.currentAmmo--;
		return true;
	}

	public boolean reload() {
		//System.out.println("Reloading...");
		this.currentAmmo = this.ammoCapacity;
		return true;
	}

}
