package com.quiz;
import java.util.Scanner;
public class Game {
	
	Scanner sc=new Scanner(System.in);
	
	Question[] questions=new Question[3];
	Player player=new Player();
	
	String[] questionsdata= {"Who is called as god of cricket?","Who is the strongest avenger?","What is the capital of america?"};    
	String[] option1= {"Brain laura","Hulk","Washington"};
	String[] option2= {"Sachin Tendulkar","Thor","Las Vegas"};
	String[] option3= {"Rickey Ponting","Black Panther","California"};
	String[] option4= {"Virendar Sehwag","Iron man","New York"};
	int[] useranswerdata= {2,1,4};
	
	public void initgame() {
		
		for(int i=0;i<3;i++) {
			
    	  questions[i]=new Question();
		} 
		
		//	questions[0].question="Who is called as god of cricket?";
		//questions[0].option1="Brain lara";
		//	questions[0].option2="SachinTendulkar";
		//questions[0].option3="RickeyPonting";
		//questions[0].option4="VirendarSehwag";
		//questions[0].correct answer=2;
    			
		//questions[1].question="Who is the strongest avenger?";
		//questions[1].option1="Hulk";
		//questions[1].option2="Thor";
		//questions[1].option3="Black Panther";
		//questions[1].option4="Iron man";
		//questions[1].correct answer=1;
		
		//questions[2].question="What is the capital of America?";
		//questions[2].option1="Washington";
		//questions[2].option2="LasVegas";
		//questions[2].option3="California";
		//questions[2].option4="New York";
		//questions[2].correct answer=4;
		
		for(int i=0;i<3;i++) {
			questions[i].question=questionsdata[i];
			questions[i].option1=option1[i];
			questions[i].option2=option2[i];
			questions[i].option3=option3[i];
			questions[i].option4=option4[i];
			questions[i].correctanswer=useranswerdata[i];
		}
    }
		public void play() {
			
			player.getDetails();
			
			for(int i=0;i<3;i++) 
			{
				
				boolean b=questions[i].askquestion();
				
				if(b==true) {
					
					System.out.println("Sariyaanathu, yes it is a correct answer and your score is given below out of 3");
					System.out.println(player.score=player.score+1);
					System.out.println();
							
				}else {
					System.out.println("Thappu, your chosen a wrong one and your score is given below out of 3");
					System.out.println(player.score=player.score-1);
					System.out.println();
				}
			}
			System.out.println("Your name is "+player.name+" and your total score is "
					+player.score);
			
		}
		
	}












