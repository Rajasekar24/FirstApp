package com.variablesonetwo;

public class Country {

	private int id;
	private String name, continent, currency,capital;
	private long population;
	private State[] state;
	
	public Country(int id, String name, String continent, String currency,
			String capital, long population, State[] state) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
		this.currency = currency;
		this.capital = capital;
		this.population = population;
		this.state = state;
	}

	public int getId() {
		return id;
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

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public State[] getState() {
		return state;
	}

	public void setState(State[] state) {
		this.state = state;
	}
	
	
}
