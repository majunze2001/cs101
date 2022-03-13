package ma.COLLECTOR;

import java.util.ArrayList;

import ma.PARTICALE.Particle;
import ma.SUPPORTING.Location;

public class ParticleCollector {
	
	private String collectorID;
	private Location collectorPOS;
	private ArrayList<Particle> collectorPool;
	public static final int COLLECTOR_CAPACITY = 500;
	
	public ParticleCollector(String collectorID, Location collectorPOS) {
		super();
		this.collectorID = collectorID;
		this.collectorPOS = collectorPOS;
		this.collectorPool = new ArrayList<Particle>();
	}

	public String getCollectorID() {
		return collectorID;
	}

	public void setCollectorID(String collectorID) {
		this.collectorID = collectorID;
	}

	public Location getCollectorPOS() {
		return collectorPOS;
	}

	public void setCollectorPOS(Location collectorPOS) {
		this.collectorPOS = collectorPOS;
	}

	public ArrayList<Particle> getCollectorPool() {
		return collectorPool;
	}

	public void setCollectorPool(ArrayList<Particle> collectorPool) {
		this.collectorPool = collectorPool;
	}

	public static int getCollectorCapacity() {
		return COLLECTOR_CAPACITY;
	}
	
	public boolean collectParticle(Particle P) {
		if (collectorPool.size() + 1 <= COLLECTOR_CAPACITY) {
			collectorPool.add(P);
			return true;
		}else {
			return false;
		}
	}
	
	

}
