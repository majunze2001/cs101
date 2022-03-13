package ma.REFINER;

import java.util.ArrayList;

import ma.EXTRACTOR.ParticleExtractor;
import ma.INTERFACES.Refinable;

import ma.PARTICALE.A_Particle;
import ma.PARTICALE.B_Particle;
import ma.PARTICALE.C_Particle;
import ma.PARTICALE.Particle;
import ma.SUPPORTING.Location;

public class ParticleRefiner implements Refinable {

	private String refinerID;
	private String refinerName;
	private Location refinerPos;
	private ArrayList<Particle> pStorage;
	private ArrayList<A_Particle> Refined_AStorage;
	private ArrayList<B_Particle> Refined_BStorage;
	private ArrayList<C_Particle> Refined_CStorage;

	public ParticleRefiner(String refinerID, String refinerName, Location refinerPos) {
		super();
		this.refinerID = refinerID;
		this.refinerName = refinerName;
		this.refinerPos = refinerPos;
		this.pStorage = new ArrayList<Particle>();
		this.Refined_AStorage = new  ArrayList<A_Particle>();
		this.Refined_BStorage = new  ArrayList<B_Particle>();
		this.Refined_CStorage = new  ArrayList<C_Particle>();
		
	}

	public String getRefinerID() {
		return refinerID;
	}

	public void setRefinerID(String refinerID) {
		this.refinerID = refinerID;
	}

	public String getRefinerName() {
		return refinerName;
	}

	public void setRefinerName(String refinerName) {
		this.refinerName = refinerName;
	}

	public Location getRefinerPos() {
		return refinerPos;
	}

	public void setRefinerPos(Location refinerPos) {
		this.refinerPos = refinerPos;
	}

	public ArrayList<Particle> getpStorage() {
		return pStorage;
	}

	public void setpStorage(ArrayList<Particle> pStorage) {
		this.pStorage = pStorage;
	}

	public ArrayList<A_Particle> getRefined_AStorage() {
		return Refined_AStorage;
	}

	public void setRefined_AStorage(ArrayList<A_Particle> refined_AStorage) {
		Refined_AStorage = refined_AStorage;
	}

	public ArrayList<B_Particle> getRefined_BStorage() {
		return Refined_BStorage;
	}

	public void setRefined_BStorage(ArrayList<B_Particle> refined_BStorage) {
		Refined_BStorage = refined_BStorage;
	}

	public ArrayList<C_Particle> getRefined_CStorage() {
		return Refined_CStorage;
	}

	public void setRefined_CStorage(ArrayList<C_Particle> refined_CStorage) {
		Refined_CStorage = refined_CStorage;
	}

	public A_Particle refineAParticle(A_Particle p) {
		p.setRefined(true);
		return p;
	}

	public B_Particle refineBParticle(B_Particle p) {
		p.setRefined(true);
		return p;
	}

	public C_Particle refineCParticle(C_Particle p) {
		p.setRefined(true);
		return p;
	}
	
	public boolean emptyExtractor (ParticleExtractor pe) {
		if (pe.getExtractorPool().size() == 0) {
			return false;
		}
		for (Particle p: pe.getExtractorPool()) {
			pStorage.add(p);
		}
		pe.getExtractorPool().clear();
		
		for (Particle p:pStorage) {
			if(p.getRetrievalCode().startsWith("A")) {
				Refined_AStorage.add(refineAParticle((A_Particle) p));
			}
			if(p.getRetrievalCode().startsWith("B")) {
				Refined_BStorage.add(refineBParticle((B_Particle) p));
			}
			if(p.getRetrievalCode().startsWith("C")) {
				Refined_CStorage.add(refineCParticle((C_Particle) p));
			}
		}
		return true;
	}
	
	public void sampleParticles(int count) {
		for (int i = 0; i <count; i++) {
			pStorage.get(i).displayParticleInfo();
		}
	}
	
	@Override
	public String toString() {
		return "ParticleRefiner:"
				+"\nRefiner ID: " + refinerID 
				+ "\nRefiner Name: " + refinerName 
				+ "\nRefiner Position: " + refinerPos
				+ "\nStorage: " + pStorage 
				+ "\nRefined_AStorage: " + Refined_AStorage
				+ "\nRefined_BStorage: " + Refined_BStorage 
				+ "\nRefined_CStorage: " + Refined_CStorage;
	}

	public void displayinfo() {
		System.out.println(this.toString());
	}
	
	
}
