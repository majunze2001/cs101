package ma.MODULE;

import ma.COMPONENTS.FootPad;
import ma.COMPONENTS.LowerLeg;
import ma.COMPONENTS.UpperLeg;
import ma.ENUMS.Side;

public class ForwardLeg extends Module {

	private Side legSide;
	private UpperLeg uprLeg;
	private LowerLeg lwrLeg;
	private FootPad pad;

	public ForwardLeg(String side) {
		super("Forward Leg");
		this.setLength(3);
		this.setHeight(8);
		this.setWidth(2);
		this.setMass(6);
		if (side.equals("Right")) {
			this.setLegSide(Side.Right);
		}else {
			this.setLegSide(Side.Left);
		}
		this.uprLeg = new UpperLeg(legSide);
		this.lwrLeg = new LowerLeg(legSide);
		this.pad = new FootPad(legSide);
	}

	public Side getLegSide() {
		return legSide;
	}

	public void setLegSide(Side legSide) {
		this.legSide = legSide;
	}

	public UpperLeg getUprLeg() {
		return uprLeg;
	}

	public void setUprLeg(UpperLeg uprLeg) {
		this.uprLeg = uprLeg;
	}

	public LowerLeg getLwrLeg() {
		return lwrLeg;
	}

	public void setLwrLeg(LowerLeg lwrLeg) {
		this.lwrLeg = lwrLeg;
	}

	public FootPad getPad() {
		return pad;
	}

	public void setPad(FootPad pad) {
		this.pad = pad;
	}

	@Override
	public void showSpecs() {
		System.out.println(this.getType() + ":");
		System.out.println("\t" + this.getUprLeg().toString());
		System.out.println("\t" + this.getLwrLeg().toString());
		System.out.println("\t" + this.getPad().toString());
	}

}
