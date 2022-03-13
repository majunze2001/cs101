package ma.WALKERS;

import ma.INTERFACES.Combatable;
import ma.INTERFACES.Moveable;
import ma.INTERFACES.Transportable;
import ma.MODULE.Command;
import ma.MODULE.ForwardLeg;
import ma.MODULE.RearLeg;
import ma.MODULE.Transport;
import ma.SUPPORT.Position;

import java.util.*;

public abstract class ImperialWalker implements Moveable, Transportable, Combatable {
	private String type;
	private String idNumber;
	private int height;
	private int width;
	private int length;
	private int mass;
	private int TroopCapacity;
	private Position currentPosition;
	private Command cmdModule;
	private Transport cargoModule;
	private TreeMap<String, RearLeg> aftLeg;
	private TreeMap<String, ForwardLeg> fwdLeg;

	public ImperialWalker(String type, String idNumber) {
		this.type = type;
		this.idNumber = idNumber;
		aftLeg = new TreeMap<>();
		aftLeg.put("Right", new RearLeg("Right"));
		aftLeg.put("Left", new RearLeg("Left"));
		fwdLeg = new TreeMap<>();
		fwdLeg.put("Right", new ForwardLeg("Right"));
		fwdLeg.put("Left", new ForwardLeg("Left"));
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getTroopCapacity() {
		return TroopCapacity;
	}

	public void setTroopCapacity(int troopCapacity) {
		TroopCapacity = troopCapacity;
	}

	public Position getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Position currentPosition) {
		this.currentPosition = currentPosition;
	}

	public Command getCmdModule() {
		return cmdModule;
	}

	public void setCmdModule(Command cmdModule) {
		this.cmdModule = cmdModule;
	}

	public Transport getCargoModule() {
		return cargoModule;
	}

	public void setCargoModule(Transport cargoModule) {
		this.cargoModule = cargoModule;
	}

	public TreeMap<String, RearLeg> getAftLeg() {
		return aftLeg;
	}

	public void setAftLeg(TreeMap<String, RearLeg> aftLeg) {
		this.aftLeg = aftLeg;
	}

	public TreeMap<String, ForwardLeg> getFwdLeg() {
		return fwdLeg;
	}

	public void setFwdLeg(TreeMap<String, ForwardLeg> fwdLeg) {
		this.fwdLeg = fwdLeg;
	}

	public abstract void displayWalkerSpecs(); 

}
