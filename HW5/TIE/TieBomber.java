package ma.TIE;

import ma.SUPPORT.LaserCannon;
import ma.SUPPORT.Location;
import ma.SUPPORT.ProtonBomb;
import ma.SUPPORT.TiePilot;

public class TieBomber {

	private String manufacturer;
	private String iDNumber;
	private String model;
	private LaserCannon[] cannons;
	private ProtonBomb[] bombay;
	private TiePilot[] pilots;
	private String bomberClass;
	private double length;
	private double width;
	private double height;
	private int fuelCapacity;
	private int maxSpeed;
	private boolean isLanded;
	private boolean isSpaceborne;
	private Location currentLocation;

	public TieBomber(String iDNumber) {
		this.iDNumber = iDNumber;
		this.manufacturer = "Sienar Fleet Systems";
		this.model = "Tie Bomber";
		this.bomberClass = "Close Support";
		this.length = 7.8;
		this.width = 8.6;
		this.height = 5.0;
		this.fuelCapacity = 375;
		this.maxSpeed = 850;
		this.currentLocation = new Location(10, 12, 0);
		this.cannons = new LaserCannon[2];
		for (int c = 0;c < 2;c++) {
			this.cannons[c] = new LaserCannon("L2");
		}
		this.bombay = new ProtonBomb[8];
		for (int c = 0;c < 8;c++) {
			this.bombay[c] = new ProtonBomb("P1");
		}
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getiDNumber() {
		return iDNumber;
	}

	public void setiDNumber(String iDNumber) {
		this.iDNumber = iDNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LaserCannon[] getCannons() {
		return cannons;
	}

	public void setCannons(LaserCannon[] cannons) {
		this.cannons = cannons;
	}

	public ProtonBomb[] getBombay() {
		return bombay;
	}

	public void setBombay(ProtonBomb[] bombay) {
		this.bombay = bombay;
	}


	public TiePilot[] getPilost() {
		return pilots;
	}

	public void setPilots(TiePilot[] pilot) {
		this.pilots = pilot;
	}

	public String getBomberClass() {
		return bomberClass;
	}

	public void setBomberClass(String bomberClass) {
		this.bomberClass = bomberClass;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isLanded() {
		return isLanded;
	}

	public void setLanded(boolean isLanded) {
		this.isLanded = isLanded;
	}

	public boolean isSpaceborne() {
		return isSpaceborne;
	}

	public void setSpaceborne(boolean isSpaceborne) {
		this.isSpaceborne = isSpaceborne;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public void displayBomberData() {
		System.out.println("TIE BOMBER " + this.iDNumber);
		System.out.println(" BUILT BY: " + this.manufacturer);
		System.out.println(" MODEL: " + this.model);
		System.out.println(" CLASS: " + this.bomberClass);
		System.out.println(" LENGTH:" + this.length + "m WIDTH:" + this.width + "m HEIGHT:" + this.height + "m");
		System.out.println(" FUEL CAPACITY:" + this.fuelCapacity + " kg");
		System.out.println(" MAX SPEED:" + this.maxSpeed + " kmph");
		System.out.println(" LOCATION:COORD-> " + this.currentLocation.toString());
	}

	public void firesCannons() {
		for (LaserCannon i : cannons) {
			i.Fire();
		}
	}

	public boolean dropBombs() {
		boolean flag = false;
		for (ProtonBomb i : bombay) {
			if (!i.isDropped()) {
				flag = true;
				break;
			}
		}
		if (flag) {
			for (ProtonBomb i : bombay) {
				if (!i.isDropped()) {
					i.Fire();
					System.out.println("Bombs Away");
				}
			}
		} else {
			System.out.println("Bombs Expended");
		}
		return flag;
	}

	public void scanTarget() {
		System.out.println(this.iDNumber + "is scanning for targets");
	}

	public boolean moveLeft() {
		int x = this.currentLocation.getX();
		x--;
		this.currentLocation.setX(x);
		return true;
	}

	public boolean moveRight() {
		int x = this.currentLocation.getX();
		x++;
		this.currentLocation.setX(x);
		return true;
	}

	public boolean moveForward() {
		int y = this.currentLocation.getY();
		y++;
		this.currentLocation.setY(y);
		return true;
	}

	public boolean moveBackward() {
		int y = this.currentLocation.getY();
		y--;
		this.currentLocation.setY(y);
		return true;
	}

	public boolean ascend() {
		int z = this.currentLocation.getZ();
		z++;
		this.currentLocation.setZ(z);
		return true;
	}

	public boolean descend() {
		int z = this.currentLocation.getZ();
		z--;
		this.currentLocation.setZ(z);
		return true;
	}

	public boolean land() {
		this.currentLocation.setZ(0);
		this.isLanded = true;
		this.isSpaceborne = false;
		return true;
	}

	public boolean takeOff() {
		this.currentLocation.setZ(10);
		this.isLanded = false;
		this.isSpaceborne = true;
		return true;
	}

}
