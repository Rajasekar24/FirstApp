package com.circket;

import java.util.Arrays;

public class Team {

	private String name, country;
	private Player[] players;
	private Coach[] coachs;
	private Sponsor[] sponsers;

	public Team(String name, String country, Player[] players, Coach[] coachs, Sponsor[] sponsers) {
		super();
		this.name = name;
		this.country = country;
		this.players = players;
		this.coachs = coachs;
		this.sponsers = sponsers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public Coach[] getCoachs() {
		return coachs;
	}

	public void setCoachs(Coach[] coachs) {
		this.coachs = coachs;
	}

	public Sponsor[] getSponsers() {
		return sponsers;
	}

	public void setSponsers(Sponsor[] sponsers) {
		this.sponsers = sponsers;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", country=" + country + ", \nplayers=" + Arrays.toString(players) + ", \ncoachs="
				+ Arrays.toString(coachs) + ", \nsponsers=" + Arrays.toString(sponsers) + "]";
	}
	
	

}
