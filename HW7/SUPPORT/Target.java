package ma.SUPPORT;

public class Target {
	private String tgt;
	private boolean isAlive;
	private Position Pos;
	
	public Target(String tgt) {
		super();
		this.tgt = tgt;
	}

	public String getTgt() {
		return tgt;
	}

	public void setTgt(String tgt) {
		this.tgt = tgt;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Position getPos() {
		return Pos;
	}

	public void setPos(Position pos) {
		Pos = pos;
	}
	
	@Override
	public String toString() {
		return this.tgt + "at " + this.Pos.getLoc().toString() 
				+ "is Alive = " + this.isAlive;
	}

}
