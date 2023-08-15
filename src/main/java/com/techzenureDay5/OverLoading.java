package com.techzenureDay5;

class Employee{
	int empno;
	String name;
	float sal;
	
	Employee(){  }
	Employee(int empno, String name){
		this.empno=empno;
		this.name=name;
	}
	Employee(int a,String b,float c){
		this(a,b); //constructor chaining: Process of calling one constructor by the another constructor of same class
		/*
		 * empno=a;
		 * name=b;
		 */
		sal=c;
	}
	void getDetails() {
		System.out.println(this.empno+  " | " + this.name+  " | "+ this.sal);
	}
}

public class OverLoading {
	public static void main(String[] arg)
	{
		Employee emp1=new Employee();
		Employee emp2=new Employee(101,"Kavan");
		Employee emp3=new Employee(102,"Rowdy", 123.33f);
		
		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}