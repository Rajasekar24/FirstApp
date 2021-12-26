package com.countryexample;

public class UseCountry {

	public static void main(String[] args) {

		Flag f = new Flag(20.02f, "multi-color", "India- Flag", 1);
		// f.setId(1);
		// f.setColors("multi-Color");
		// f.setName("Indian FLag");
		// f.setSize(20.2f);

		// c.setFlag(f);

		Currency cur = new Currency(1, "Indian-Curreny", "INR","@", 0.013f);
		// cur.setCode("INR");
		// cur.setId(1);
		// cur.setName("INDIAN -CURRENCY");
		// cur.setSymbol((char) '₹');
		// // cur.Symbol = "0xE2 0x82 0xB9";
		// cur.setUSDExchange(0.013f);

		// c.setCurrency(cur);
		//
		State s1 = new State(1, "Tamil Nadu", 1000001l);
		// s1.setId(1);
		// s1.setName("Tamil Nadu");
		// s1.setPopulation(1000000l);

		State s2 = new State(2, "Kerala", 100003l);
		// s2.setId(2);
		// s2.setName("Kerala");
		// s2.setPopulation(1000020l);

		State[] s = new State[] { s1, s2 };
		// s[0] = s1;
		// s[1] = s2;

		// c.setStates(s);

		Place p1 = new Place(1, "Rameshwaram",
				"Rameshwaram is located on a beautiful island in the South Indian state of Tamil Nadu. It is separated by a small Pamban channel from Sri Lanka. According to Hindu mythology, this is the place where Lord Rama created a bridge across the sea to Sri Lanka.");
		// p1.setId(1);
		// p1.setName("Rameshwaram");
		// p1.setDescription("Rameshwaram is located on a beautiful island in the South
		// Indian state of Tamil Nadu. It is separated by a small Pamban channel from
		// Sri Lanka. According to Hindu mythology, this is the place where Lord Rama
		// created a bridge across the sea to Sri Lanka.");

		Place p2 = new Place(2, "Ooty",
				"Nestled amidst Nilgiri hills, Ooty, also known as Udagamandalam, is a hill station in Tamil Nadu which serves as a top-rated tourist destination. Once regarded as the summer headquarters of the East India Company, the Queen of the hills is a picturesque getaway.");
		// p2.setId(2);
		// p2.setName("Ooty");
		// p2.setDescription("Nestled amidst Nilgiri hills, Ooty, also known as
		// Udagamandalam, is a hill station in Tamil Nadu which serves as a top-rated
		// tourist destination. Once regarded as the summer headquarters of the East
		// India Company, the Queen of the hills is a picturesque getaway.");

		Place[] p = new Place[] { p1, p2 };
		// p[0] = p1;
		// p[1] = p2;

		// c.setPlaces(p);

		Country c = new Country("India", "Delihi", "Name", 240, f, cur, s, p);

		Country cc = new Country("name", "capital", "president");
		System.out.println("CAPITAL:" + cc.getCapital());

		Country c1 = new Country();
		c1.setName("India");
		c1.setLanguage(240);
		c1.setCapital("Delihi");
		c1.setPresident("Name");

//		 TimeZone.getTimeZone(0);

		// SOP Country
		System.out.println("===Country===");
		System.out.println(c.toString());
		// System.out.println("Name:" + c.getName());
		// System.out.println("President:" + c.getPresident());
		// System.out.println("Capital:" + c.getCapital());
		// System.out.println(c.getName() + " cosmopolitan Country :"
		// + c.iscosmopolitanCountry());
		// System.out.println(c.getName() + " has Storng Curncy "
		// + c.isStorngerCurrency());
		// System.out.println(c.getName() + " pop " + c.getCountryPop());

		// SOP States
		System.out.println("===States===");
		for (State w : c.getStates()) {
			System.out.println(w);
			// System.out.println("Name:" + w.name);
			// System.out.println("Population:" + w.population);
		}
		// SOP Places
		System.out.println("===Places===");
		for (Place q : c.getPlaces()) {
			System.out.println(q);
			// System.out.println("Name " + q.name);
			// System.out.println("Description " + q.description);
		}

		// SOP Currency
		System.out.println("===Currency===");
		System.out.println(c.getCurrency().toString());
		// System.out.println("Name " + c.getName());
		// System.out.println("Code " + c.getCurrency().getCode());
		// System.out.println("USD Exchange" +
		// c.getCurrency().getUSDExchange());
		// System.out.println();

		// SOP Flag
		System.out.println("===Flag===");
		System.out.println(c.getFlag().toString());

	}
}
