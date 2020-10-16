package Avengers;
import java.util.Scanner;
public class avenger {
	
	Scanner sc=new Scanner(System.in);
	public String name;
	public int age;
	public String power;
	public String weapon;
	public String planet;
	
	public void getDetails() {
		
		System.out.println("Enter the avenger name");
		name=sc.nextLine();

		System.out.println("Enter the avenger age");
		age=sc.nextInt();
		
		System.out.println("Enter the power name");
		power=sc.next();
		
		System.out.println("Enter the weapon name");
		weapon=sc.next();
		
        System.out.println("Enter the planet name");
		planet=sc.next();
		System.out.println();	
	}
	
	public void displayDetails() {
		
		System.out.println("The name of the avenger is "+name+", and the age "
				+ "is "+age+", his power is "+power+", and his weapon is "
				+weapon+", and he is in "+planet+" now.");                                           
	}
	
	
	

}
