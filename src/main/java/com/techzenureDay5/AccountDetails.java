/**
 * Program to generate Account Details followed by Creation of Deposit, Withdraw and Check Balance .
 * @author Naveen
 *  @since 5th August 2023
 */

package com.techzenureDay5;

public class AccountDetails {
	private long acno;
	private String name;
	private float bal;
	
	public AccountDetails(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	// creation of Deposit method
	public void deposit(float amt) {
		this.bal +=amt;
		System.out.println("Rs." +amt+ "  Credited   |   Balance:"+ this.bal);
	}
	
	// Creation of withdraw method
	public void withdraw(float amt) {
		if(this.bal>=amt) {
			this.bal=this.bal-amt;
			System.out.println("Rs." +amt+ "  Debited   |   Balance" +this.bal);
		}else {
			System.err.println("Error: Insufficient Balance");
		}
	}
	
	// Creation of Get Balance method
  public void getBalance() {
	  System.out.println("A/C No:" +this.acno+ "|  Name:" +this.name +"|  Balance:" +this.bal );
  }
}
