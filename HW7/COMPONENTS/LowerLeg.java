package ma.COMPONENTS;

import ma.ENUMS.Side;

public class LowerLeg extends LegComponent {

	public LowerLeg(Side legSide) {
		super("Lower",legSide);
	}
	
	@Override
	public String toString() {
		return this.getLegSide() + ", " + this.getType();
	}
}
