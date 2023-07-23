package com.cg.application;

import com.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit) {
		
		System.out.println("Dear Current User, your Account Balance are: " +getaccBal()+
				" and Credit Charges is " + creditLimit);
	}

	@Override
	public String toString() {
		return "GSCurrentAcc [getcreditLimit()=" + getcreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getaccBal()=" + getaccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	
	
}