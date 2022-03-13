package ma.PARTICALE;

import ma.SUPPORTING.Mineral;

public class B_Particle extends Particle {

	private static int BParticleCount = 0;

	public B_Particle(String retrievalCode) {
		super(retrievalCode, 1.7, 396, 18, Mineral.TRITANIUM);
		this.setRefined(false);
		BParticleCount++;
	}

	public static int getBParticleCount() {
		return BParticleCount;
	}

	public static void setBParticleCount(int bParticleCount) {
		BParticleCount = bParticleCount;
	}

	@Override
	public double scatterLight() {
		return this.getpComposition().getStrength() * Math.sqrt(10);
	}

}
