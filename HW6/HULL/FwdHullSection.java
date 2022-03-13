package ma.HULL;

public class FwdHullSection extends HullSection {

	public FwdHullSection(String StarDestroyerType) {
		this.setHullType("Fwd");
		if (StarDestroyerType.equals("Imperial_I")) {
			this.setLength(900);
			this.setHeight(100);
			this.setWidth(75);
			this.setWeight(350);
		}
		if (StarDestroyerType.equals("Imperial_II")) {
			this.setLength(900);
			this.setHeight(100);
			this.setWidth(200);
			this.setWeight(400);
		}	
	}


}
