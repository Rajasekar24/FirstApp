package com.variablesoneone;

public class Address {

	private int doorNum, pinCode;
	private String streetname, townName, district, state;

	public Address(int doorNum, int pinCode, String streetname,
			String townName, String district, String state) {
		this.doorNum = doorNum;
		this.pinCode = pinCode;
		this.streetname = streetname;
		this.townName = townName;
		this.district = district;
		this.state = state;
	}

	public void setDoorNum(int num) {
		doorNum = num;
	}

	public int getDoorNum() {
		return doorNum;
	}

	public void setPinCode(int pin) {
		pinCode = pin;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setStreetName(String val) {
		streetname = val;
	}

	public String getStreetName() {
		return streetname;
	}

	public void setTownName(String val) {
		townName = val;
	}

	public String getTownName() {
		return townName;
	}

	public void setDistrict(String val) {
		district = val;
	}

	public String getDistrict() {
		return district;
	}

	public void setState(String val) {
		state = val;
	}

	public String getState() {
		return state;
	}

}
