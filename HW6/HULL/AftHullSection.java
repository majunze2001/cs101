package ma.HULL;

public class AftHullSection extends HullSection {

	public AftHullSection(String starDestroyerType) {
		this.setHullType("Aft");
		if (starDestroyerType.equals("Imperial_I")) {
			this.setLength(700);
			this.setHeight(200);
			this.setWidth(325);
			this.setWeight(550);
		}
		if (starDestroyerType.equals("Imperial_II")) {
			this.setLength(900);
			this.setHeight(275);
			this.setWidth(300);
			this.setWeight(700);
		}	
	}


}
