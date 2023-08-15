package com.techzenureDay3;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		int num,b,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum:");
		 num = sc.nextInt();
		 
		 while(num > 0) {
			 b = num%10;
			 sum = sum+b;
			 num = num/10;
		 }
		
	    System.out.format("sum of digits of given num=%d",sum);
	    sc.close();
	
	}

}
