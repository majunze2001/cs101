package ma.MODULE;

public abstract class Module {

	private String type;
	private String walkerType;
	private int length;
	private int height;
	private int width;
	private int mass;


	public Module(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWalkerType() {
		return walkerType;
	}

	public void setWalkerType(String walkerType) {
		this.walkerType = walkerType;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public abstract void showSpecs();

}
