package ma.GENERATOR;

import ma.PARTICALE.B_Particle;
import ma.SUPPORTING.Location;

public class Part_BGenerator extends ParticleGenerator {

	private static final String PTYPE = "B_Particle";
	private static final int PCAPACITY = 180;
	private static int GENERATED_COUNT = 0;

	public Part_BGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);
	}

	public static int getGENERATED_COUNT() {
		return GENERATED_COUNT;
	}

	public static void setGENERATED_COUNT(int gENERATED_COUNT) {
		GENERATED_COUNT = gENERATED_COUNT;
	}

	public static String getPtype() {
		return PTYPE;
	}

	public static int getPcapacity() {
		return PCAPACITY;
	}

	@Override
	public B_Particle generateParticle() {
		GENERATED_COUNT++;
		return new B_Particle("B" + getGENERATED_COUNT());
	}

}
