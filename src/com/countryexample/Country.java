package com.countryexample;

public class Country extends PlacePartent {

	private String name, Capital, president;
	private int language;

	private Flag flag;
	private Currency currency;

	private State[] states;
	private Place[] places;

	public Country() {
		
	}


	public Country(String name, String capital, String president) {
		this.name = name;
		Capital = capital;
		this.president = president;
	}



	public Country(String name, String capital, String president, int language,
			Flag flag, Currency currency, State[] states, Place[] places) {
		this.name = name;
		Capital = capital;
		this.president = president;
		this.language = language;
		this.flag = flag;
		this.currency = currency;
		this.states = states;
		this.places = places;
	}

	// public Country(String name2,String capital,String president,int language
	// ) {
	// // super(id, name, description);
	// name = name2;
	// Capital = capital;
	// this.president = president;
	// this.language = language;
	// // this.flag = flag;
	// // this.currency = currency;
	// // this.states = states;
	// // this.places = places;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return Capital;
	}

	public void setCapital(String capital) {
		Capital = capital;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public int getLanguage() {
		return language;
	}

	public void setLanguage(int language) {
		this.language = language;
	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public State[] getStates() {
		return states;
	}

	public void setStates(State[] states) {
		this.states = states;
	}

	public Place[] getPlaces() {
		return places;
	}

	public void setPlaces(Place[] places) {
		this.places = places;
	}

	public boolean iscosmopolitanCountry() {

		return (this.language > 10) ? true : false;
	}

	public long getCountryPop() {
		long total = 0;
		for (State i : states) {
			total += i.getPopulation();
		}
		return total;
	}

	public boolean isStorngerCurrency() {
		return (currency.getUSDExchange() >= 1) ? true : false;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", Capital=" + Capital
				+ ", president=" + president + ", language=" + language
				+ ", flag=" + flag + ", currency=" + currency + "]";
	}

}
















 