package com.mphasis;

abstract public class Account {
	private long accNo;
	private String accHolderName;
	private String bankName;
	private String ifsc;
	private String location;
	private int pin;
	public Account() {
		super();
	}
	public Account(long accNo, String accHolderName, String bankName, String ifsc, String location) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.location = location;
		pin=generatePin();
	}
	private int generatePin() {
		int newPin=(int)Math.round(Math.random()*10000);
		return newPin;
	}
	
	
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPin() {
		return pin;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", bankName=" + bankName + ", ifsc="
				+ ifsc + ", location=" + location + ", pin=" + pin + "]";
	}
	
	public abstract void withDraw(double amount) throws InsufficientFundsExcepition ;
	
	public abstract void deposit(double amount) ;
	
	public abstract void changePin(int pin);
	
	public void setPin() {
		pin=generatePin();
	}
	
	
	
}
