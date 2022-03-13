package ma.SUPPORTING;

public class Location {
	
	private String name;
	private int X;
	private int Y;
	
	public Location(String name, int x, int y) {
		super();
		this.name = name;
		X = x;
		Y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
	public double euclideanDistance(Location L) {
		double d = 0;
		double x = this.getX() -L.getX();
		double y = this.getY() -L.getY();
		d = Math.sqrt(x * x + y * y);
		return d;
	}

	@Override
	public String toString() {
		return "Location " + name + ": [X: " + X + ", Y: " + Y + "]";
	}
	
	

}
