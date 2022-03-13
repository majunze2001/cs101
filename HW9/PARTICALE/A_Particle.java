package ma.PARTICALE;

import ma.SUPPORTING.Mineral;

public class A_Particle extends Particle {

	private static int AParticleCount = 0;

	public A_Particle(String retrievalCode) {
		super(retrievalCode, 1.3, 124, 7, Mineral.DILITHIUM);
		this.setRefined(false);
		AParticleCount++;
	}

	public static int getAParticleCount() {
		return AParticleCount;
	}

	public static void setAParticleCount(int aParticleCount) {
		AParticleCount = aParticleCount;
	}

	
	@Override
	public double scatterLight() {
		return this.getpComposition().getStrength() * Math.sqrt(10) * 0.28 * this.getpComposition().getMass();
	}

}
