package com.oopsoverloading;

public class UseLoan {
	public static void main(String[] args) {
		PersonalDetails pd = new PersonalDetails(25, "Raja", true, true, true, true);
		
		PersonalLoan pl = new PersonalLoan();
		pl.pd = pd;
		pl.eligibily();
		
		PropertyLoan pl1 = new PropertyLoan();
		pl1.pd = pd;
		pl1.loanType ="new property";
		pl1.eligibily();
		
		EduLoan el = new EduLoan();
		el.colgName = "vit";
		el.dgreeName = "mca";
		el.pd = pd;
		el.eligibily();
		
		}
}
