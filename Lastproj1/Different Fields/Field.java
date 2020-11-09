package Persons;
import java.util.Scanner;
public class Field {
		
	Scanner sc=new Scanner(System.in);
	String name,field;
	int age,qualifiedyear;
	
	public void getDetails() {
		
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter your field = Doctor (or) Engineer (or) Pilot");
		field=sc.next();
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("Enter the Qualified year");
		qualifiedyear=sc.nextInt();
	}		
	
	public void displayDetails(){
	
		System.out.println("Your name is "+name+" and your field is "+field
				+", your age is "+age+" and finally your qualification is "
				+qualifiedyear);
		System.out.println("--------------");
	}
    public void qualification() {
		System.out.println("**");
	}
	public void experience() {
		System.out.println("**");
	}
}
	

