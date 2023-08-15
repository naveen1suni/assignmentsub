package com.techzenureDay5;
import java.util.*;


class Student
{
    private static String collegeName = "NIT";
    private int studentId;
    private String studentName, studentAddress;
    
    Student(int studentId, String studentName, String studentAddress)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    
    Student(int studentId, String studentName, String studentAddress, String collegeName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }
    
    public int getStudentId()
    {
        return studentId;
    } 
    
    public String getStudentName()
    {
        return studentName;
    }
    
    public String getStudentAddress()
    {
        return studentAddress;
    }
    
    public String getCollegeName()
    {
        return collegeName;
    }
	
}
public class Studentmain {
	
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       Student student;
       System.out.print("Enter Student's Id:");
       int id = sc.nextInt();
       System.out.print("Enter Student's Name:");
       String name = sc.next();
       System.out.print("Enter Student's address:");
       String address = sc.next();
       System.out.print("Whether the student is from NIT(Yes/No):");
       String isNIT = sc.next();
       while(true)
       {
            if(isNIT.equals("YES") || isNIT.equals("yes"))
            {
              student= new Student(id,name,address);
              break;
            }
	        else if(isNIT.equals("NO") || isNIT.equals("no"))
	        {
	           System.out.print("Enter the college name:");
	           String college = sc.next();
	           student= new Student(id,name,address,college);
	           break;
	        }
	        else 
	        {
	          System.out.println("Wrong Input");
	          System.out.print("Whether the student is from NIT(Yes/No):");
	          isNIT = sc.next();
	        }
	
       }
  
       int studentId = student.getStudentId();
       String studentName = student.getStudentName();
       String studentAddress = student.getStudentAddress();
       String collegeName = student.getCollegeName();
       System.out.println(" ");
       System.out.println("Student id:"+studentId);
       System.out.println("Student name:"+studentName);
       System.out.println("Address:"+studentAddress);
       System.out.println("College Name:"+collegeName);
   
   }
}