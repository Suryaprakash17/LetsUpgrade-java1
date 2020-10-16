package com.java;

public class Main {

	public static void main(String[] args) {
		
		
		Employee[] employees=new Employee[4];  
				//get details
		for(int i=0;i<4;i++) 
			
		{
			employees[i] =new Employee();
			employees[i].getDetails();
			
		}
		
		for(int i=0;i<4;i++) {
			
			employees[i].display();
		}
			
		
		
	
	}

}
