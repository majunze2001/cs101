package ma.ENUMS;

public enum Crewman {
	Driver("Driver"), 
	Commander("Commander"), 
	Gunner("Gunner");
	
	private String type;
	
	private Crewman(String tgt) {
		this.type = tgt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
