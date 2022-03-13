package ma.ENUMS;

public enum Stormtrooper {
	Standard("Standard",76,215,25),
	Scout("Scout",72,185,28),
	Assault("Assault",74,230,26);
	
	private String type;
	private int height;
	private int weight;
	private int age;
	
	
	private Stormtrooper(String type, int height, int weight, int age) {
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
