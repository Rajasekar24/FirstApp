package com.circket;

import java.time.LocalDate;

public class UseCricket {

	public static void main(String[] args) {

		// Team1 players
		String[] r1 = { "Batting" };
		Player p1 = new Player(1, 20, 20, 7, "Player1", r1, true);

		String[] r2 = { "Batting", "wicketkeeper" };
		Player p2 = new Player(2, 22, 40, 0, "Player2", r2, true);

		String[] r3 = { "Batting", "Slip" };
		Player p3 = new Player(3, 23, 10, 5, "Player3", r3, true);

		String[] r4 = { "Batting", "point" };
		Player p4 = new Player(4, 26, 70, 2, "Player4", r4, true);

		// Team2 players
		String[] r21 = { "Batting" };
		Player p21 = new Player(21, 20, 80, 2, "Player21", r21, true);

		String[] r22 = { "Batting", "wicketkeeper" };
		Player p22 = new Player(22, 29, 90, 1, "Player22", r22, true);

		String[] r23 = { "Batting", "Slip" };
		Player p23 = new Player(23, 30, 45, 4, "Player23", r23, true);

		String[] r24 = { "Batting", "point" };
		Player p24 = new Player(24, 31, 60, 6, "Player24", r24, true);

		// Team1 Coach
		Coach c1 = new Coach("C1", "Team Player");
		Coach c2 = new Coach("C2", "Team Player, wicketkeeper");

		// Team2 Coach
		Coach c21 = new Coach("C1", "Team Player");
		Coach c22 = new Coach("C2", "Team Player, wicketkeeper");

		// Team1 Sponsor
		Sponsor s1 = new Sponsor("Samsung", "Tech", 5, 123456789, true);
		Sponsor s2 = new Sponsor("Sony", "Tech", 3, 123456, false);

		// Team2 Sponsor
		Sponsor s21 = new Sponsor("Realme", "Tech", 4, 1234567, false);
		Sponsor s22 = new Sponsor("Readme", "Tech", 4, 12345678, false);

		Player[] pp1 = new Player[] { p1, p2, p3, p4 };
		Player[] pp2 = new Player[] { p21, p22, p23, p24 };

		Coach[] cc1 = new Coach[] { c1, c2 };
		Coach[] cc2 = new Coach[] { c21, c22 };

		Sponsor[] ss1 = new Sponsor[] { s1, s2 };
		Sponsor[] ss2 = new Sponsor[] { s21, s22 };

		Team t1 = new Team("CSK", "INDIA", pp1, cc1, ss1);
		Team t2 = new Team("RBC", "INDIA", pp2, cc2, ss2);

		Team[] teams = new Team[] { t1, t2 };

		CircketResult c = new CircketResult("Test-Match", "Chennai", "T-20", teams, LocalDate.of(2021, 12, 06));

		System.out.println(c.getName());
		
		System.out.println("Team A Score :" + c.getTeam1Score());
		System.out.println("Team B Score :" + c.getTeam2Score());

		System.out.println(c.getTeam1Score() > c.getTeam2Score() ? "TEAM-A" : "TEAM-B" + " WIN!!!!!");

		System.out.println("Team A Collection :" + c.getTeam1SponserCollection());
		System.out.println("Team B Collection :" + c.getTeam2SponserCollection());

		System.out.println("Match Collection :" + (c.getTeam1SponserCollection() + c.getTeam2SponserCollection()));

		System.out.println("Man of the Match is :" + c.getManOfMatch());
		System.out.println("Highest Wicket in the Match is :" + c.getHigheshWicket());

		System.out.println("Title Sponsor :" + c.getHigheshSponser());
		System.out.println("===RESULT===");
		System.out.println(c);
	}
}
