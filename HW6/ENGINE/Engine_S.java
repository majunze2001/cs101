package ma.ENGINE;

public class Engine_S extends ShipEngine {

	public Engine_S(String StarDestroyerType) {
		super("S", StarDestroyerType, 0, 0, 0, 0);
		//super(EngineType,StarDestroyerType, 100, 50, 8000000, 100);
		this.setEngineType("S");
		if (StarDestroyerType.equals("Imperial_I")) {
			this.setLength(100);
			this.setHeight(50);
			this.setPower(8000000);
			this.setWeight(100);
		}
		if (StarDestroyerType.equals("Imperial_II")) {
			this.setLength(115);
			this.setHeight(60);
			this.setPower(9000000);
			this.setWeight(100);
		}
	}
	

}
