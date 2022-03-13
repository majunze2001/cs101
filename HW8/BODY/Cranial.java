package ma.BODY;

public class Cranial extends Body {
	
	private boolean Operational;

	public Cranial(String iDNumber) {
		super(iDNumber, "Cranial");
		this.Operational = true;
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean operational) {
		Operational = operational;
	}


}
