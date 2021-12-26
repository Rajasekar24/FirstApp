package com.oopsoverloading;

public class PropertyLoan extends Loan {

	PersonalDetails pd;
	String loanType;

	@Override
	void eligibily() {
		// TODO Auto-generated method stub
		if (this.loanType.equalsIgnoreCase("new property")) {
			System.out.println(((pd.age > 18) && (pd.offerletter) && (pd.panCard) && (pd.payslip)) ? "You can Take new property Loan"
					: "Sry, try some time later for new property");
		} else if(this.loanType.equalsIgnoreCase("house construction")) {
			System.out.println(((pd.age > 18) && (pd.offerletter) && (pd.panCard) && (pd.payslip)) ? "You can Take House Construction Loan"
					: "Sry, try some time later for House construction");
		}

	}

}
