package Persons;
import java.util.Scanner;
public class Pilot extends Field {
	 	
	    Scanner sc=new Scanner(System.in);
		int salary;
		String degree;
		
		public void qualification() {
			
			System.out.println("What is your degree");
			degree=sc.nextLine();
			System.out.println("Can you say your salary");
			salary=sc.nextInt();
			
		}
		
		public void experience() {
			
			System.out.println("You must have atleast 5-6 years experience");
		}
}
