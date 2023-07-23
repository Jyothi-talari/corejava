package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	

	protected final float creditLimit;
	

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public float getcreditLimit() {
		return creditLimit;
	}

	public void withdraw(float creditLimit) {
		System.out.println("Credit Limit are: "+ creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getaccBal()=" + getaccBal() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}