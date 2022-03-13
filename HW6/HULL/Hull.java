package ma.HULL;

public class Hull {
	private String IDNumber;
	private FwdHullSection SectionFWD;
	private AftHullSection SectionAFT;

	public Hull(String iDNumber, String StarDestroyerType) {
		IDNumber = iDNumber;
		SectionFWD = new FwdHullSection(StarDestroyerType);
		SectionAFT = new AftHullSection(StarDestroyerType);
	}

	public void displayHullSpecs() {
		System.out.println("________Hull SPECIFICATIONS");
		System.out.println("Hull Number: " + this.IDNumber);
		System.out.println("\t\t\tLength\tHeight\tWidth\tWeight");
		System.out.println("Forward Hull:\t\t" + this.SectionFWD.HullInfo());
		System.out.println("Aft Hull:\t\t" + this.SectionAFT.HullInfo());
	}

}
