package com.lastpro;
import java.util.Scanner;
public class Employees {

	Scanner sc=new Scanner(System.in);
	
	String name,designation;
	int age;
	
	public void getDetails() {
		System.out.println("Enter the name, age, designation");
		name=sc.nextLine();
		age=sc.nextInt();
		designation=sc.nextLine();
		System.out.println("------------------");
	} 
	
	public void displayDetails() {
		
		System.out.println(name+" "+age+" "+" "+designation);
		System.out.println("-------------------");
	}
    public void salary() {
    	
    	System.out.println("Salary");
    }
}
