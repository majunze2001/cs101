package ma.PARTICALE;

import ma.SUPPORTING.Mineral;

public class C_Particle extends Particle {

	private static int CParticleCount = 0;

	public C_Particle(String retrievalCode) {
		super(retrievalCode, 2.1, 518, 24, Mineral.UNAMIUM);
		this.setRefined(false);
		CParticleCount++;
	}

	public static int getCParticleCount() {
		return CParticleCount;
	}

	public static void setCParticleCount(int cParticleCount) {
		CParticleCount = cParticleCount;
	}

	@Override
	public double scatterLight() {
		return this.getpComposition().getMass() * 10;
	}


}
