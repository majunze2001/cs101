package ma.ARM;

public class RightArm extends Arm {

	private boolean Operational;

	public RightArm(String iDNumber) {
		super(iDNumber, "Right Arm");
		this.Operational = true;
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean operational) {
		Operational = operational;
	}

}
