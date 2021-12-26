package com.circket;

public class Coach {

	private String name, skill;

	public Coach(String name, String skill) {
		this.name = name;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Coach [name=" + name + ", skill=" + skill + "]";
	}

}
