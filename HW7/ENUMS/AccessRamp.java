package ma.ENUMS;

public enum AccessRamp {
	ATAT("Heavy Ramp"),
	ATST("Soft Ramp");
	
	private String type;
	
	private AccessRamp(String type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	
	

}
