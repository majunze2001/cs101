package ma.IMPERIALDROID;

import java.util.TreeMap;

import ma.ARM.Arm;
import ma.ARM.LeftArm;
import ma.ARM.RightArm;
import ma.BODY.Cranial;
import ma.BODY.Torso;
import ma.LEG.LeftLeg;
import ma.LEG.Leg;
import ma.LEG.RightLeg;

public abstract class ImperialDroid {
	private String DroidID;
	private String DroidType;
	private Cranial Head;
	private Torso UpperTorso;
	private TreeMap<String,Arm> Arms;
	private TreeMap<String,Leg> Legs;
	
	public ImperialDroid(String droidID, String droidType) {
		super();
		DroidID = droidID;
		DroidType = droidType;
		this.Head = new Cranial(this.DroidID);
		this.UpperTorso = new Torso(this.DroidID);
		this.Arms = new TreeMap<String,Arm>();
		Arms.put("Right", new RightArm(this.DroidID));
		Arms.put("Left", new LeftArm(this.DroidID));
		this.Legs = new TreeMap<String,Leg>();
		Legs.put("Right", new RightLeg(this.DroidID));
		Legs.put("Left", new LeftLeg(this.DroidID));
	}

	public String getDroidID() {
		return DroidID;
	}

	public void setDroidID(String droidID) {
		DroidID = droidID;
	}

	public String getDroidType() {
		return DroidType;
	}

	public void setDroidType(String droidType) {
		DroidType = droidType;
	}

	public Cranial getHead() {
		return Head;
	}

	public void setHead(Cranial head) {
		Head = head;
	}

	public Torso getUpperTorso() {
		return UpperTorso;
	}

	public void setUpperTorso(Torso upperTorso) {
		UpperTorso = upperTorso;
	}

	public TreeMap<String, Arm> getArms() {
		return Arms;
	}

	public void setArms(TreeMap<String, Arm> arms) {
		Arms = arms;
	}

	public TreeMap<String, Leg> getLegs() {
		return Legs;
	}

	public void setLegs(TreeMap<String, Leg> legs) {
		Legs = legs;
	}
	
	
	@Override
	public String toString() {
		return "ImperialDroid:"
				+ "\nDroidID: " + DroidID 
				+ "\nDroidType: " + DroidType
				+ "\nHead: " + Head 
				+ "\nUpperTorso:" + UpperTorso 
				+ "\nArms: " + Arms 
				+ "\nLegs: " + Legs;
	}

	public void displayInfo(){
		System.out.println(this.toString());
	}
	
	
	public void runDiagnostic() {
		if (this.getHead().isOperational() == false) {
			System.out.println(this.DroidID + " Malfunction");
			return;
		}
		if (this.getUpperTorso().isOperational() == false) {
			System.out.println(this.DroidID + " Malfunction");
			return;
		}
		if(((RightArm) (this.getArms().get("Right"))).isOperational() == false) {
			System.out.println(this.DroidID + " Malfunction");
			return;
		}
		if(((LeftArm) (this.getArms().get("Left"))).isOperational() == false) {
			System.out.println(this.DroidID + " Malfunction");
			return;
		}
		if(((RightLeg) (this.getLegs().get("Right"))).isOperational() == false) {
			System.out.println(this.DroidID + " Malfunction");
			return;
		}
		if(((LeftLeg) (this.getLegs().get("Left"))).isOperational() == false) {
			System.out.println(this.DroidID + " Malfunction");
			return;
		}
		System.out.println(this.DroidID + " is Fully Operational");
	}

}
