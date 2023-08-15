/**
 * Program to develop the Banking Application, "Deposit, Withdraw and Check Balance" are imported from AccountDetails class and development of Create Account, Exit methods.
 * @author Naveen
 *  @since 5th August 2023
 */


package com.techzenureDay5;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountDetails acc=null;
		
		while(true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			
			System.out.println("Enter the Option:");
			int opt=sc.nextInt();
			
			switch(opt) {
			case 1://Create Account
				if(acc==null) {
					System.out.println("Enter Account Number:");
					long acNo=sc.nextLong();
					sc.nextLine();//when we given string datatype after the long datatype, the string data type is skipped to the next line
					
					System.out.println("Enter Name:");
					String name=sc.nextLine();
					
					System.out.println("Enter Initial Deposit:");
					float amt=sc.nextFloat();
					
					//create an instance of the Account type
					acc=new AccountDetails(acNo,name,amt);
					System.out.println("Welcome to your Bank...");
				}else {
					System.out.println("You are having an account with us...Please do any other Options.");
				}
				break;
			case 2://Deposit
                if(acc!= null) {
					System.out.println("Enter the Amount to Deposit:");
					float amt=sc.nextFloat();
					acc.deposit(amt);
				}else {
					System.err.println("Please open an Account with Us!!!");
				}
				break;
			case 3://Withdraw
				if(acc!= null) {
					System.out.println("Enter the Amount to Withdraw:");
					float amt=sc.nextFloat();
					acc.withdraw(amt);
				}else {
					System.err.println("Please open an Account with Us!!!");
				}
				break;
			case 4://Get Details/Balance
				if(acc != null) {
					acc.getBalance();
				}else {
					System.err.println("Please open an Account with Us!!!");
				}
				break;
			case 5://exit
				System.out.println("Application was designed and developed by");
				System.out.println("\t team@Techzenure");
				sc.close();
				System.exit(0);//to terminate the program execution
				break;
			default:
					System.out.println("***Invalid Option----Try Again***");
			}//end of switch loop
			
		}//end of while loop
	}
}