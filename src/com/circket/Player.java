package com.circket;

import java.util.Arrays;

public class Player {

	private int id, age, score, wicket;
	private String name;
	private String[] roles;
	private boolean isPlaying;

	public Player(int id, int age, int score, int wicket, String name, String[] roles, boolean isPlaying) {
		this.id = id;
		this.age = age;
		this.score = score;
		this.wicket = wicket;
		this.name = name;
		this.roles = roles;
		this.isPlaying = isPlaying;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", age=" + age + ", score=" + score + ", wicket=" + wicket + ", name=" + name
				+ ", roles=" + Arrays.toString(roles) + ", isPlaying=" + isPlaying + "]";
	}

}
