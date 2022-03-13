package ma.GENERATOR;

import ma.PARTICALE.A_Particle;
import ma.SUPPORTING.Location;

public class Part_AGenerator extends ParticleGenerator {

	private static final String PTYPE = "A_Particle";
	private static final int PCAPACITY = 100;
	private static int GENERATED_COUNT = 0;

	public Part_AGenerator(String pGeneratorID, Location pGeneratorPos) {
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
	public A_Particle generateParticle() {
		GENERATED_COUNT++;
		return new A_Particle("A" + GENERATED_COUNT);
	}

}
