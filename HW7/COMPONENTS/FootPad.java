package ma.COMPONENTS;

import ma.ENUMS.Side;

public class FootPad extends LegComponent {
	

	public FootPad(Side legSide) {
		super("Pad",legSide);

	}
	
	@Override
	public String toString() {
		return this.getLegSide() + ", " + this.getType();
	}
	
	
	

}
