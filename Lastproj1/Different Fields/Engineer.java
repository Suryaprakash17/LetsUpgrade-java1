package Persons;

import java.util.Scanner;

public class Engineer extends Field {

	 Scanner sc=new Scanner(System.in);
	 int salary;
	 String degree;
	 
	 public void qualification() {
			
	 System.out.println("What is your degree qualification");
	 degree=sc.next();
	 System.out.println("What is your salary");
	 salary=sc.nextInt();
			
	}
		
	 public void experience() {
	 System.out.println("You must have atleast 4-5 years experience");
 }
}
