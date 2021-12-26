package com.oopsoverloading;

public class EduLoan extends Loan {

	PersonalDetails pd ;
	String colgName, dgreeName;
	
	
	@Override
	void eligibily() {
		// TODO Auto-generated method stub
		if(colgName.equalsIgnoreCase("VIT") && dgreeName.equalsIgnoreCase("MCA")) {
			System.out.println(((pd.age > 18) && (pd.offerletter) && (pd.panCard) && (pd.payslip)) ? "You can Take 100% Loan"
					: "Sry, try some time later loan");
		} else {
			System.out.println(((pd.age > 18) && (pd.offerletter) && (pd.panCard) && (pd.payslip)) ? "You can Take 80% Loan"
					: "Sry, try some time later loan");
		}
	}
	
}
