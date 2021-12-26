package com.countryexample;

public class State {

	private int id;

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

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	private String name;
	private Long population;

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", population="
				+ population + "]";
	}

	public State(int id, String name, Long population) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
	}

}
