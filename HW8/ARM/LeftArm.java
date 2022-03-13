package ma.ARM;

public class LeftArm extends Arm {
	
	private boolean Operational;

	public LeftArm(String iDNumber) {
		super(iDNumber, "Left Arm");
		this.Operational = true;
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean operational) {
		Operational = operational;
	}

	
}
