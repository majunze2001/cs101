package ma.ENGINE;

public class Engine {
	private String IDNumber;
	private ShipEngine[] Engines;
	
	public Engine(String iDNumber,String StarDestroyerType) {
		IDNumber = iDNumber;
		Engines = new ShipEngine[3];
		Engines[0] = new Engine_S(StarDestroyerType);
		Engines[1] = new Engine_C(StarDestroyerType);
		Engines[2] = new Engine_S(StarDestroyerType);
	}
	
	public void displayEngineSpecs() {
		System.out.println("________ENGINE SPECIFICATIONS");
		System.out.println("Engine Number: " + this.IDNumber);
		System.out.println("\t\t\tLength\tHeight\tPower\t\tWeight");
		System.out.println("Engine S1:\t\t" + this.Engines[0].EngineInfo());
		System.out.println("Engine C:\t\t" + this.Engines[1].EngineInfo());
		System.out.println("Engine S2:\t\t" + this.Engines[2].EngineInfo());
		
	}
	
	

}
