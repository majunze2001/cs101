package ma.PARTICALE;

import ma.INTERFACES.Scatterable;
import ma.SUPPORTING.Mineral;

public abstract class Particle implements Scatterable{
	
	private String retrievalCode;
	private double pDiameter;
	private double pVolume;
	private double pSurfaceArea;
	private Mineral pComposition;
	private boolean isRefined;
	public static int particleCount = 0;
	
	public Particle(String retrievalCode, double pDiameter, double pVolume, double pSurfaceArea, Mineral pComposition) {
		super();
		this.retrievalCode = retrievalCode;
		this.pDiameter = pDiameter;
		this.pVolume = pVolume;
		this.pSurfaceArea = pSurfaceArea;
		this.pComposition = pComposition;
		particleCount++;
	}
	public String getRetrievalCode() {
		return retrievalCode;
	}
	public void setRetrievalCode(String retrievalCode) {
		this.retrievalCode = retrievalCode;
	}
	public double getpDiameter() {
		return pDiameter;
	}
	public void setpDiameter(double pDiameter) {
		this.pDiameter = pDiameter;
	}
	public double getpVolume() {
		return pVolume;
	}
	public void setpVolume(double pVolume) {
		this.pVolume = pVolume;
	}
	public double getpSurfaceArea() {
		return pSurfaceArea;
	}
	public void setpSurfaceArea(double pSurfaceArea) {
		this.pSurfaceArea = pSurfaceArea;
	}
	public Mineral getpComposition() {
		return pComposition;
	}
	public void setpComposition(Mineral pComposition) {
		this.pComposition = pComposition;
	}
	public boolean isRefined() {
		return isRefined;
	}
	public void setRefined(boolean isRefined) {
		this.isRefined = isRefined;
	}
	public static int getParticleCount() {
		return particleCount;
	}
	public static void setParticleCount(int particleCount) {
		Particle.particleCount = particleCount;
	}
	
	@Override
	public String toString() {
		return  this.retrievalCode;
				/*+ "\nDiameter: " + pDiameter 
				+ "\nVolume: " + pVolume
				+ "\nSurfaceArea: " + pSurfaceArea 
				+ "\nComposition: " + pComposition 
				+ "\nisRefined: " + isRefined + "\n";*/
	}
	
	public void displayParticleInfo() {
		String S = "Particle: " + retrievalCode
				+ "\nDiameter: " + pDiameter 
				+ "\nVolume: " + pVolume
				+ "\nSurfaceArea: " + pSurfaceArea 
				+ "\nComposition: " + pComposition 
				+ "\nisRefined: " + isRefined + "\n";
		System.out.println(S);

	}
}
