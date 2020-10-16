package com.employee;
import java.util.Scanner;
public class Employee {
	
	Scanner sc=new Scanner(System.in);
	public String name;
	public int date_birth;
	public int month_birth;
	public int year_birth;
	public int monthly_salary;
	public int num;
    
	public void getDetails() {

		System.out.println("Enter your name");
		name=sc.nextLine();
		
		System.out.println("Enter your date_birth");
		date_birth=sc.nextInt();
		
		System.out.println("Enter your month_birth");
	    month_birth=sc.nextInt();

		System.out.println("Enter your year_birth");
		year_birth=sc.nextInt();
		
		System.out.println("Enter your monthly_salary");
		monthly_salary =sc.nextInt();
		
		int num=monthly_salary;
		if(num>=500000) {
		
		System.out.println("You want to pay 20% tax amount");
		
		}
	else if(num>=400000){
		
		System.out.println("You want to pay 15% tax amount");
		
		}
	else if(num>=300000) {
		
		System.out.println("You want to pay 10% tax amount");
		
		}
    else if(num>=200000) {
		
		System.out.println("You want to pay 5% tax amount");
		
		}
    else if(num>=100000) {
		
		System.out.println("You want to 2.5% pay any tax amount");
	
		}
	
    else
    {
    	System.out.println("You don't want to pay any tax amount");
    	System.out.println();
 
    }

	
	}
	
	
	
	public void displayDetails() {
	 	
	 		System.out.println("Your name is "+name+", and your date of "
	 				+ "birth is "+date_birth+"."+month_birth
	 		+"."+year_birth+", and your month salary is "
	 		+monthly_salary+".");
	 	
	 	}
}

	
	 		
	 	
	 	
	






		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	
	
	
	
	
	
		
		
			
			
				
	
			
			
			
		
	
	
	
	
	
	

