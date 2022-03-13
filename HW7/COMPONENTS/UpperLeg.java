package ma.COMPONENTS;

import ma.ENUMS.Side;

public class UpperLeg extends LegComponent {

	public UpperLeg(Side legSide) {
		super("Upper",legSide);

	}
	
	@Override
	public String toString() {
		return this.getLegSide() + ", " + this.getType();
	}
}
