package com.cg.client;

import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.application.MMBankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;
import com.cg.framework.BankFactory;

public class Client {

	public static void main(String[] args) {
		BankFactory sf = new MMBankFactory();
		
		
		SavingAcc pa = new MMSavingAcc(70000,"Faiz",12,true);
		pa.withdraw(pa.getaccBal());
		pa.toString();
		
		CurrentAcc na = new MMCurrentAcc(1002,"Pradhnya",300,102);
		na.withdraw(na.getcreditLimit());
		na.toString();
		

	}

}