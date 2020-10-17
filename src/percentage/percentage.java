package percentage;
import java.util.Scanner;
public class percentage {
	
	Scanner sc=new Scanner(System.in);
	
	public int num1,num2,num3,num4,num5,total;
	double per;
	
	public void getDetails() {
		
		System.out.println("Enter your Tamil subject mark");
		num1=sc.nextInt();
		System.out.println("Enter your English subject mark");
		num2=sc.nextInt();
		System.out.println("Enter your Mathematics subject mark");
		num3=sc.nextInt();
		System.out.println("Enter your Science subject mark");
		num4=sc.nextInt();
		System.out.println("Enter your Socialscience subject mark");
		num5=sc.nextInt();
		System.out.println();
		total=num1+num2+num3+num4+num5;
		per=(total/500.0)*100;
		
	}	
	
		public void Displaydetails() {
			
			System.out.println("The total marks of 5 subjects is "+total+" and your"
					+" percentage is "+per);
			

		} 
		
	

}


