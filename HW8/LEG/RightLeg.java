package ma.LEG;

public class RightLeg extends Leg {
	
	private boolean Operational;

	public RightLeg(String iDNumber) {
		super(iDNumber, "Right Leg");
		this.Operational = true;
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean operational) {
		Operational = operational;
	}

}
