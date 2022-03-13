package ma.FIGHTER;

import java.io.Serializable;
import java.util.TreeMap;

import ma.COMPONENT.Assembly;
import ma.INTERFACES.Specifiable;

public class SithInfiltrator implements Serializable, Specifiable {

	private static final long serialVersionUID = 1L;
	private String idNumber;
	private String model;
	private double length;
	private double width;
	private double height;
	private TreeMap<String, Assembly> structure;

	public SithInfiltrator(String idNumber, TreeMap<String, Assembly> structure) {
		super();
		this.idNumber = idNumber;
		this.model = "Sith Infiltrator";
		this.length = 26.6;
		this.width = 16.6;
		this.height = 6.6;
		this.structure = structure;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public TreeMap<String, Assembly> getStructure() {
		return structure;
	}

	public void setStructure(TreeMap<String, Assembly> structure) {
		this.structure = structure;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString(){
	return "Sith Infiltrator"
			+ "\nIDNumber: " + this.idNumber
			+ "\nModel: " + this.model
			+ "\nLength: " + this.length
			+ "\nWidth: " + this.width
			+ "\nHeight: " + this.height
			+"\n___Infiltrator Structure___"
			+ "\nAft Fuselage: " + this.structure.get ("Aft Fuselage").getIdNumber()
			+ "\nEwd Fuselage: " + this.structure.get ("Fwd Fuselage").getIdNumber()
			+ "\nCockpit: " + this.structure.get ("Cockpit").getIdNumber()
			+ "\nStabilizers: " + this.structure.get ("Left Stabilizer").getIdNumber()
			+ "\nStabilizers: " + this.structure.get ("Right Stabilizer").getIdNumber();
	}
	
}
