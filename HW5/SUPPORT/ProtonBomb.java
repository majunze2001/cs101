package ma.SUPPORT;

public class ProtonBomb {

	private String model;
	private int yield;
	private boolean dropped;

	public ProtonBomb(String model) {
		this.model = model;
		this.yield = 7;
		this.dropped = false;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYield() {
		return yield;
	}

	public void setYield(int yield) {
		this.yield = yield;
	}

	public boolean isDropped() {
		return dropped;
	}

	public void setDropped(boolean dropped) {
		this.dropped = dropped;
	}

	public void Fire() {
		this.dropped = true;
	}

}
