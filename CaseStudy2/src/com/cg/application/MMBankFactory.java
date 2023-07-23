package com.cg.application;

import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;
import com.cg.framework.BankFactory;

public class MMBankFactory extends BankFactory {
	
	public MMSavingAcc getNewSavingAccount(int accNo, String accNm,float accBal, boolean isSalaried) {
		MMSavingAcc gsSaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return gsSaving;
		
	}
	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm,float accBal, float creditLimit) {
		MMCurrentAcc gsCurrent= new MMCurrentAcc(accNo,  accNm, accBal,  creditLimit);
		return gsCurrent;
		
	}
}

