package ma.GENERATOR;

import ma.INTERFACES.Generatable;
import ma.SUPPORTING.Location;

public abstract class ParticleGenerator implements Generatable {

	public String pGeneratorID;
	public Location pGeneratorPos;
	
	public ParticleGenerator(String pGeneratorID, Location pGeneratorPos) {
		super();
		this.pGeneratorID = pGeneratorID;
		this.pGeneratorPos = pGeneratorPos;
	}

	public String getpGeneratorID() {
		return pGeneratorID;
	}

	public void setpGeneratorID(String pGeneratorID) {
		this.pGeneratorID = pGeneratorID;
	}

	public Location getpGeneratorPos() {
		return pGeneratorPos;
	}

	public void setpGeneratorPos(Location pGeneratorPos) {
		this.pGeneratorPos = pGeneratorPos;
	}
	
	
	
}
