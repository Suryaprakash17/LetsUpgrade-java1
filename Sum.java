package Oddvalues;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		int a[]=new int[num];
		
			for(int i=0;i<num;i++) {
			
			System.out.println("Enter the element");
			a[i]=sc.nextInt();
			
			}
			
			for(int i=0;i<num;i++) {
		        
			System.out.println("The sum of elements are");
			int sum=a[i]+a.length;	
			System.out.println(sum);
		}
		
	}
}
