package ma.SUPPORT;

public class LaserCannon {

	private String model;
	private int maxRange;
	private int ammoCapacity;
	private int currentAmmoCount;

	public LaserCannon(String model) {
		this.model = model;
		this.maxRange = 1000;
		this.ammoCapacity = 500;
		this.currentAmmoCount = 500;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public int getCurrentAmmoCount() {
		return currentAmmoCount;
	}

	public void setCurrentAmmoCount(int currentAmmoCount) {
		this.currentAmmoCount = currentAmmoCount;
	}

	public void Fire() {
		if (this.currentAmmoCount > 0) {
			this.currentAmmoCount--;
			System.out.println("Firing Cannon");
		} else {
			System.out.println("Ammunition Expended");
		}
	}

}
