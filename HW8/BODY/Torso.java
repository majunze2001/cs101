package ma.BODY;

public class Torso extends Body {
	
	private boolean Operational;

	public Torso(String iDNumber) {
		super(iDNumber, "Torso");
		this.Operational = true;
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean operational) {
		Operational = operational;
	}

}
