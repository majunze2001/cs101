package ma.ENGINE;

public class Engine_C extends ShipEngine {

	public Engine_C(String StarDestroyerType) {
		super("C", StarDestroyerType, 0, 0, 0, 0);
		this.setEngineType("S");
		if (StarDestroyerType.equals("Imperial_I")) {
			this.setLength(225);
			this.setHeight(75);
			this.setPower(15000000);
			this.setWeight(125);
		}
		if (StarDestroyerType.equals("Imperial_II")) {
			this.setLength(275);
			this.setHeight(80);
			this.setPower(17000000);
			this.setWeight(125);
		}
	}
}
