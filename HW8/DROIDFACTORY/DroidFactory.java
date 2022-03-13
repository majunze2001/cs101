package ma.DROIDFACTORY;

public abstract class DroidFactory {

	private String IDNumber;
	private String BuildType;

	public DroidFactory(String iDNumber, String buildType) {
		super();
		IDNumber = iDNumber;
		BuildType = buildType;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getBuildType() {
		return BuildType;
	}

	public void setBuildType(String buildType) {
		BuildType = buildType;
	}

	@Override
	public String toString() {
		return "DroidFactory:"
				+ "\nIDNumber: " + IDNumber
				+ "\nBuildType: " + BuildType;
	}

	public void displayInfo() {
		System.out.println(this.toString());
	}

}
