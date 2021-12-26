package com.countryexample;

public class Currency {
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

	public Currency(int id, String name, String code, String symbol,
			float uSDExchange) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		Symbol = symbol;
		USDExchange = uSDExchange;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public float getUSDExchange() {
		return USDExchange;
	}

	public void setUSDExchange(float uSDExchange) {
		USDExchange = uSDExchange;
	}

	private String name, code;
	private String Symbol;
	private float USDExchange;

	@Override
	public String toString() {
		return "Currency [id=" + id + ", name=" + name + ", code=" + code
				+ ", Symbol=" + Symbol + ", USDExchange=" + USDExchange + "]";
	}

}
