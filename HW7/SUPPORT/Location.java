package ma.SUPPORT;

public class Location {
	private int x;
	private int y;
	private int z;
	
	public Location(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public double getEuclidean(Location L) {
		double x = this.getX() - L.getX();
		double y = this.getY() - L.getY();
		double z = this.getZ() - L.getZ();
		double d = x * x + y * y + z * z;
		return Math.sqrt(d);
	}
	
	@Override
	public String toString() {
		return "[" + this.getX() + ", " + this.getY() + ", " + this.getZ() + "]";
		}
	

}
