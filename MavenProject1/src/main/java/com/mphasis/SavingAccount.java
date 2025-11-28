package com.mphasis;

public class SavingAccount extends Account{
		
		private double balance;
		
		public SavingAccount() {
			super();
		}
		public SavingAccount(long accNo, String accHolderName, String bankName, String ifsc, String location,
				double balance) {
			super(accNo, accHolderName, bankName, ifsc, location);
			this.balance = balance;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "SavingAccount [balance=" + balance + ", AccNo=" + getAccNo() + ", AccHolderName="
					+ getAccHolderName() + ", BankName=" + getBankName() + ",Ifsc=" + getIfsc()
					+ ", Location=" + getLocation() + ", Pin=" + getPin() + "]";
		}
		
		public void withDraw(double amount) throws InsufficientFundsExcepition {
			if(amount<this.balance) {
				this.balance=this.balance-amount;
				System.out.println("Withdraw Successfull");
			}
			else {
				throw new InsufficientFundsExcepition("Amount is more than the balance");
			}
		}
		public void deposit(double amount) {
			this.balance=this.balance+amount;
			System.out.println("Deposited Successfully");
		}
		
		public double checkBalance() {
			return this.getBalance();
		}
		@Override
		public void changePin(int pin) {
			if(getPin()==pin) {
				super.setPin();
				System.out.println("Pin changed successfully");
			}
			else {
				System.err.println("Pin not match with old pin");
			}
		}
		
		
		
		//changePin() and generatePin()
		
}
