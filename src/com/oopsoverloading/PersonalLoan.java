package com.oopsoverloading;

public class PersonalLoan extends Loan {

  PersonalDetails pd;	
	
	
	@Override
	void eligibily() {
		// TODO Auto-generated method stub
		if((pd.age >18) && (pd.offerletter)&& (pd.panCard)&& (pd.payslip)) {
			System.out.println("You can Take Loan");
		}else {
			System.out.println("Sry, try some time later");
		}
	}

	
	
}
