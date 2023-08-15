package com.techzenureDay3;

import java.util.Scanner;

public class Printodd {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number:");
			int n = sc.nextInt();
			
			System.out.println("odd numbers are ");
			
			for(int i=1; i<n; i=i+2) {
				
				System.out.print(i + "    ");
				
				
		}
			sc.close();
		}
	}