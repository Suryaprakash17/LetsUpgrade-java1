package Avengers;

public class main {

	public static void main(String[] args) {
		
		avenger[] Avengers=new avenger[10];
		
		for(int i=0;i<5;i++) {
			
			Avengers[i]=new avenger();
			Avengers[i].getDetails();
		}
		
		for(int i=0;i<5;i++) {
			
			Avengers[i].displayDetails();
		}
		

	}

}
