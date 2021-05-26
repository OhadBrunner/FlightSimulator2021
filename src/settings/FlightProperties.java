package settings;

import java.io.Serializable;

public class FlightProperties implements Serializable{
	
	protected String ip;
	protected String port;
	protected int valuesTransmittionPace; // not sure how to use it yet
	
	// joystick
	protected int aileron; // X
	protected int elevator; // Y
	protected int rudder;
	protected int throttle;

	// control panel
	protected int Z; // altitude
	protected int Y; // speed
	protected int AK; // direction
	protected int roll;
	protected int pitch;
	protected int yaw;
	
	public FlightProperties() {}


	public FlightProperties(String ip, String port, int valuesTransmittionPace, int aileron, int elevator, int rudder, int throttle, int Z, int Y, int AK,
			int roll, int pitch, int yaw) {
		this.ip = ip;
		this.port = port;
		this.valuesTransmittionPace = valuesTransmittionPace;
		this.aileron = aileron;
		this.elevator = elevator;
		this.rudder = rudder;
		this.throttle = throttle;
		this.Z = Z;
		this.Y = Y;
		this.AK = AK;
		this.roll = roll;
		this.pitch = pitch;
		this.yaw = yaw;
	}
	
	
	//	Getters & Setters


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}


	public int getValuesTransmittionPace() {
		return valuesTransmittionPace;
	}


	public void setValuesTransmittionPace(int valuesTransmittionPace) {
		this.valuesTransmittionPace = valuesTransmittionPace;
	}


	public int getAileron() {
		return aileron;
	}


	public void setAileron(int aileron) {
		this.aileron = aileron;
	}


	public int getElevator() {
		return elevator;
	}


	public void setElevator(int elevator) {
		this.elevator = elevator;
	}


	public int getRudder() {
		return rudder;
	}


	public void setRudder(int rudder) {
		this.rudder = rudder;
	}


	public int getThrottle() {
		return throttle;
	}


	public void setThrottle(int throttle) {
		this.throttle = throttle;
	}


	public int getZ() {
		return Z;
	}


	public void setZ(int z) {
		Z = z;
	}


	public int getY() {
		return Y;
	}


	public void setY(int y) {
		Y = y;
	}


	public int getAK() {
		return AK;
	}


	public void setAK(int aK) {
		AK = aK;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public int getPitch() {
		return pitch;
	}


	public void setPitch(int pitch) {
		this.pitch = pitch;
	}


	public int getYaw() {
		return yaw;
	}


	public void setYaw(int yaw) {
		this.yaw = yaw;
	}
	
	
	

}
