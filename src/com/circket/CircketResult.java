package com.circket;

//import java.time.Instant;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;

import java.time.LocalDate;
import java.util.Arrays;

public class CircketResult extends Result {

	private String name, location, series;
	private Team[] teams;
	LocalDate date = LocalDate.of(2021, 12, 06);

	public CircketResult(String name, String location, String series, Team[] teams, LocalDate date) {
		super();
		this.name = name;
		this.location = location;
		this.series = series;
		this.teams = teams;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Team[] getTeams() {
		return teams;
	}

	public void setTeams(Team[] teams) {
		this.teams = teams;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	int getTeam1Score() {
		int total = 0;
//		for(Player p: teams[0]) {
		for (int i = 0; i < teams[0].getPlayers().length; i++) {
			total += teams[0].getPlayers()[i].getScore();
		}
		return total;
	}

	int getTeam2Score() {
		int total = 0;
//		for(Player p: teams[0]) {
		for (int i = 0; i < teams[1].getPlayers().length; i++) {
			total += teams[1].getPlayers()[i].getScore();
		}
		return total;
	}

	int getTeam1SponserCollection() {
		int money = 0;
		for (int i = 0; i < teams[0].getSponsers().length; i++) {
			money += teams[0].getSponsers()[i].getAmount();
		}
		return money;
	}

	int getTeam2SponserCollection() {
		int money = 0;
		for (int i = 0; i < teams[1].getSponsers().length; i++) {
			money += teams[1].getSponsers()[i].getAmount();
		}
		return money;
	}

	String getManOfMatch() {
		int score = 0;
		String name = null;
		for (Team t : teams) { // t = team[1]
			for (Player p : t.getPlayers()) {
				if (p.getScore() > score) { // 20 40 90 70
					score = p.getScore();
					name = p.getName(); // Player p4 = new Player(4, 26, 70, 2, "Player4", r4, true);
				}
			}
		}
		
		return (name + " Score : " + score);
	}

	String getHigheshWicket() {
		int score = 0;
		String name = null;
		for (Team t : teams) {
			for (Player p : t.getPlayers()) {
				if (p.getWicket() > score) {
					score = p.getWicket();
					name = p.getName();
				}
			}
		}

		return (name + " Score : " + score);
	}

	String getHigheshSponser() {
		int score = 0;
		String name = null;
//		boolean flag = false;
		for (Team t : teams) {
//			if(flag) {
//				break;
//			}
			for (Sponsor p : t.getSponsers()) {
				if (p.isTitle()) {
					score = p.getAmount();
					name = p.getBrand();
					return (name + " Score : " + score);
//					flag = true;
//					break;
				}
			}
		}

		return (name + " Score : " + score);

	}

	@Override
	public String toString() {
		return "CircketResult [name=" + name + ", location=" + location + ", series=" + series + ", \nteams="
				+ Arrays.toString(teams) + ", date=" + date + "]";
	}

}
