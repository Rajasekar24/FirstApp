package com.variablesonetwo;

public class State {
	
	private int id;
	private String name, language, capital;
	private long population;
	public int getId() {
		return id;
	}
	
	
	public State(int id, String name, String language, String capital,
			long population) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.capital = capital;
		this.population = population;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	

}
