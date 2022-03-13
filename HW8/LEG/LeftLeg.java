package ma.LEG;

public class LeftLeg extends Leg {
	
	private boolean Operational;

	public LeftLeg(String iDNumber) {
		super(iDNumber, "Left Leg");
		this.Operational = true;
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean operational) {
		Operational = operational;
	}

}
