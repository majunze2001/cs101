package ma.SUPPORT;

public class Position {
	private String name;
	private Location loc;
	
	public Position(String name, Location loc) {
		super();
		this.name = name;
		this.loc = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}
	
	public double distanceToPosition(Position P) {
		return this.getLoc().getEuclidean(P.getLoc());
	}
	
	public void displayPosition() {
		System.out.println("Current Position: POSITION[" + this.getName() + "]");
		System.out.println("\tLocated At:  " + this.loc.toString());
	}
	

}
