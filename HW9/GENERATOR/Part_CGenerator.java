package ma.GENERATOR;

import ma.PARTICALE.C_Particle;
import ma.SUPPORTING.Location;

public class Part_CGenerator extends ParticleGenerator {

	private static final String PTYPE = "B_Particle";
	private static final int PCAPACITY = 180;
	private static int GENERATED_COUNT = 0;

	public Part_CGenerator(String pGeneratorID, Location pGeneratorPos) {
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
	public C_Particle generateParticle() {
		GENERATED_COUNT++;
		return new C_Particle("C" + getGENERATED_COUNT());
	}

}
