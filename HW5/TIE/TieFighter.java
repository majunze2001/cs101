package ma.TIE;

import ma.SUPPORT.LaserCannon;
import ma.SUPPORT.Location;
import ma.SUPPORT.TiePilot;

public class TieFighter {

	private String manufacturer;
	private String iDNumber;
	private String model;
	private LaserCannon[] cannons;
	private TiePilot pilot;
	private String fighterClass;
	private double length;
	private double width;
	private double height;
	private int fuelCapacity;
	private int maxSpeed;
	private boolean isLanded;
	private boolean isSpaceborne;
	private Location currentLocation;

	public TieFighter(String iDNumber, TiePilot pilot) {
		this.iDNumber = iDNumber;
		this.pilot = pilot;
		this.manufacturer = "Sienar Fleet Systems";
		this.model = "Tie Fighter";
		this.fighterClass = "Superiority";
		this.length = 6.3;
		this.width = 6.4;
		this.height = 7.5;
		this.fuelCapacity = 200;
		this.maxSpeed = 1200;
		this.currentLocation = new Location(10, 12, 0);
		this.cannons = new LaserCannon[2];
		for (int c = 0;c < 2;c++) {
			this.cannons[c] = new LaserCannon("L1");
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

	public TiePilot getPilot() {
		return pilot;
	}

	public void setPilot(TiePilot pilot) {
		this.pilot = pilot;
	}

	public String getFighterClass() {
		return fighterClass;
	}

	public void setFighterClass(String fighterClass) {
		this.fighterClass = fighterClass;
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

	public void displayFighterData() {
		System.out.println("TIE FIGHTER " + this.iDNumber);
		System.out.println(" BUILT BY: " + this.manufacturer);
		System.out.println(" MODEL: " + this.model);
		System.out.println(" CLASS: " + this.fighterClass);
		System.out.println(" LENGTH:" + this.length + "m WIDTH:" + this.width + "m HEIGHT:" + this.height + "m");
		System.out.println(" FUEL CAPACITY:" + this.fuelCapacity + "kg");
		System.out.println(" MAX SPEED:" + this.maxSpeed + "kmph");
		System.out.println(" LOCATION:COORD-> " + this.currentLocation.toString());
	}

	public void firesCannons() {
		for (LaserCannon i : cannons) {
			i.Fire();
		}
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
