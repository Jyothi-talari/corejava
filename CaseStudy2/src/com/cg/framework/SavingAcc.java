package com.cg.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL=0;
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdraw(float MINBAL) {
		System.out.println("main Balance are: "+ MINBAL);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getaccBalL()=" + getaccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}