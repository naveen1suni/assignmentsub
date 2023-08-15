package com.techzenureDay1;
import java.util.Scanner;

public class BillGeneration {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no of pizzas bought: ");
		int pizzas = sc.nextInt();
		System.out.print("enter the no of puffs bought: ");
		int puffs = sc.nextInt();
		System.out.print("enter the no of cool drinks bought: ");
		int cool_drinks = sc.nextInt();
		System.out.println("");
		System.out.println("---------------------------------------------");
		System.out.println("Bill Details");
		
		int total_pizzas_cost, total_puffs_cost,total_cool_drinks_cost;
		float total_price;
		
		total_pizzas_cost = pizzas * 100;
		total_puffs_cost = puffs * 20;
		total_cool_drinks_cost = cool_drinks * 10;
		total_price = total_pizzas_cost + total_puffs_cost + total_cool_drinks_cost;
		
		System.out.println("No of Pizzas: " +pizzas + "     Cost: "+total_pizzas_cost);
		System.out.println("No of Puffs: " +puffs + "     Cost: "+total_puffs_cost);
		System.out.println("No of Cool Drinks: " +cool_drinks + "     Cost: "+total_cool_drinks_cost);
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.printf("Total price=%.2f\n",total_price);
		System.out.println("ENJOY THE SHOW!!!");
		
		
		
		
		}
	
}




