/**
 * Program to generate the Overriding of Class A1 and Class B1 .
 * @author Naveen
 *  @since 5th August 2023
 */

package com.techzenureDay5;

//Every class is having the super class that is "java.lang.Object" which is extends by the Child Class.
//Every class is made as a child class of java.lang.Object
class A1 extends java.lang.Object{
	int a=10,b=20;
	void display() {
		System.out.println("In Class A1 :  "+a+ " | " +b);
	}
}
class B1 extends A1{
	int a=11,b=21;
	@Override
	void display() {
		System.out.println("In class B1 :" +this. a + " | " + this.b + " | " +  super.a + " | " + super.b);
		super.display();
	}
}
public class Overriding {

	public static void main(String[] args) {
		B1 obj=new B1();
		obj.display();

	}

}