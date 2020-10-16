package com.java;
import java.util.Scanner;
public class Employee {

	Scanner sc=new Scanner(System.in);
	public String name;
	public int age;
	public String city;
	
	public void getDetails() {
		
		System.out.println("Enter the name");
		name=sc.nextLine();
		
		System.out.println("Enter the age");
		age=sc.nextInt();
		
		System.out.println("Enter the city");
	    city=sc.next();
	}
	
	
	
	public void display() 
	{
		
		System.out.println("My name is "+name+" and my age is "+age+" and im living in "+city);
		System.out.println();
		
	}
}