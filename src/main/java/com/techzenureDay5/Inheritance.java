/**
 * Program to generate the Inheritance of Class A and Class B
 * @author Naveen
 *  @since 5th August 2023
 */

package com.techzenureDay5;

class A{
	int a=10;
	int b=20;
	void displayAB() {
		System.out.println("in class A: " +a+ " | " +b);
	}
}

class B extends A{
	int c=30;
	void displayABC() {
		System.out.println("In class B:" +a+ " | " +b+ " | " +c);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		B obj=new B();
		System.out.println(obj.a +" | " +obj.b+ " | " +obj.c);
		obj.displayAB();
		obj.displayABC();

	}

}
