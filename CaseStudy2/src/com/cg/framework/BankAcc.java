package com.cg.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	
	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccNm() {
		return accNm;
	}


	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}


	public float getaccBal() {
		return accBal;
	}


	public void setaccBal(float accBal) {
		this.accBal = accBal;
	}


	public void withdraw(float accBal) {
		System.out.println("withdraw and accBalance are: " +accBal);
	}
	public void deposite(float accBal) {
		System.out.println("Money Withdraw current Balance is: " + accBal);
	}


	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + accBal + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getaccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}

