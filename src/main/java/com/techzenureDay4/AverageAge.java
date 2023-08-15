package com.techzenureDay4;

import java.util.Scanner;

public class AverageAge {
	static Scanner scn=new Scanner(System.in);
    public static float calculateAverage(int[] age)
    { 
    	int totalAge = 0;
    	for(int i=0;i<age.length;i++)
    	{
    		totalAge+=age[i];
    	}
    	float averageAge=totalAge/age.length;
		return averageAge;	
    }
	public static void main(String[] args) {
		System.out.print("Enter total no. of employees: ");
		int n=scn.nextInt();
		if(n<=1) {
			System.out.println("please enter a valid employee count");
			return;
		}
			System.out.println("enter the age for "+n+" employees:");
		int[] age=new int[n];
		for(int i=0;i<age.length;i++)
		{
			age[i]=scn.nextInt();
		}
		for(int i=0;i<age.length;i++)
		{
			if(!(age[i]>=18 && age[i]<=40))
			{
				System.out.println("invalid age encountered");return;
			}
		}
        System.out.println("The average is "+AverageAge.calculateAverage(age));
	}

}