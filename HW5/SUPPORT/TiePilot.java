package ma.SUPPORT;

public class TiePilot {
	
	private String iDNumber;
	private String rank;
	private String pilotRating;
	
	public TiePilot(String iDNumber, String rank, String pilotRating) {
		this.iDNumber = iDNumber;
		this.rank = rank;
		this.pilotRating = pilotRating;
	}

	public String getiDNumber() {
		return iDNumber;
	}

	public void setiDNumber(String iDNumber) {
		this.iDNumber = iDNumber;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPilotRating() {
		return pilotRating;
	}

	public void setPilotRating(String pilotRating) {
		this.pilotRating = pilotRating;
	}
	
	public void displayinfo() {
		System.out.println("Imperial TiePilot: " + this.iDNumber);
		System.out.println(" RANK: " + this.rank);
		System.out.println(" RATING: " + this.pilotRating);
	}
	
	

}
