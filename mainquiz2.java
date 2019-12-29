
import java.util.Scanner; // import the swing library for I/O


public class mainquiz2
{
	/* *****************************************
	AUTHOR : Jojo

	
	   
	******************************************** */
            String name;
			mainquiz2(String name){
				this.name = name;
			}
			
		
 
   
	    public static void main (String[] param)
	    {
	        
			int score=0,questionNumber=0, impossibleVal=0; 
		
		    int prevScores[]= getScores();
			
			boolean condition=true;
		
			Scanner scanner = new Scanner(System.in);
			introduction();
			
			System.out.println("Please enter your name:");
			
		
			
			String name=scanner.nextLine();
	    
			mainquiz2 newplayer = new mainquiz2(name);
			System.out.println("Welcome to the quiz: "+newplayer.name);
			
			
			System.out.println("Be ready. It starts any moment now");
			while(condition)
			{
				
			   if(questionNumber==6)
				   break;
				
	           if(questionNumber==0){
			        q1();
					System.out.println("Enter your option");
					int option=Integer.parseInt(scanner.nextLine());
					
					if(option==0){
						break;
					}
					
					if(option==4){
						impossibleVal=1;
						score=0;
						break;
					}
					else if(option==1)
						{score+=1;
						questionNumber+=1;}
					else
						questionNumber+=1;
			   }
				
				System.out.println("");
				//System.out.println("Do you want to continue: y/n");
				//String s=scanner.nextLine();
				//if(s.equals("n")){
			//		condition=false;
				//	continue;}
				
				
				
				if(questionNumber==1){
			        q2();
					System.out.println("Enter your option");
					int option=Integer.parseInt(scanner.nextLine());
					
					if(option==0){
						break;
					}
					
					if(option==2){
						impossibleVal=1;
						score=0;
						break;
					}
					else if(option==3)
						{score+=1;
						questionNumber+=1;}
					else
						questionNumber+=1;
			   }
			   
				
				if(questionNumber==2){
			        q3();
					System.out.println("Enter your option");
					int option=Integer.parseInt(scanner.nextLine());
					
					if(option==0){
						break;
					}
					
					if(option==1){
						impossibleVal=1;
						score=0;
						break;
					}
					else if(option==3)
						{score+=1;
						questionNumber+=1;}
					else
						questionNumber+=1;
			   }
			   
			   
			   if(questionNumber==3){
			        q4();
					System.out.println("Enter your option");
					int option=Integer.parseInt(scanner.nextLine());
					
					if(option==0){
						break;
					}
					
					if(option==4){
						impossibleVal=1;
						score=0;
						break;
					}
					else if(option==2)
						{score+=1;
						questionNumber+=1;}
					else
						questionNumber+=1;
			   }
			   
			   
			   if(questionNumber==4){
			        q5();
					System.out.println("Enter your option");
					int option=Integer.parseInt(scanner.nextLine());
					
					if(option==0){
						break;
					}
					
					if(option==4){
						impossibleVal=1;
						score=0;
						break;
					}
					else if(option==1)
						{score+=1;
						questionNumber+=1;}
					else
						questionNumber+=1;
			   }
			   

				}
				
				
				
			int scores[]={0,0,0,0,0},rank=0;
			
			for(int i=0;i<4;i++){
				scores[i]=prevScores[i];
				if(scores[i]>score)
					rank+=1;
				
			}
			
			rank+=1;
			scores[4]=score;
			
			
			for(int i=0;i<4;i++)
				for(int j=i+1;j<5;j++)
					if(scores[j]<scores[i]){
						int temp = scores[i];
						scores[i]=scores[j];
						scores[j]= temp;
					}
			
			
			System.out.println("The scores of differet players are:");
			
			
			for(int i=0;i<5;i++)
				System.out.println(scores[i]);
			
			System.out.println("Your rank is:"+ rank);	
			
			System.out.println("Your final score is "+ score);
			
			
			
			
			
			
				
		 
	    } // END main


	   /* ***************************************************
	     Show how you use s.equals to test a string s for equality
	   */

	   
	    public static int[] getScores(){
			int score[]={3,3,4,2};
			return score;
		}
		
	    public static void introduction()
	        {  
				System.out.println("Welcome to the Impossible Quiz Programme. You get points for correct answers but they lose all"); 
				System.out.println("points if they choose an impossible answer: one that makes no sense");
				System.out.println("There are 4 options. For answering, you enter one of the numbers: 1,2,3, or 4 corresponding to the options. Press 0 to exit");
		    
			} 
	    
	    
        public static void q1()
	    {
            System.out.println("Which tennis player has the most Grand Slams?");
			System.out.println("1.Roger Federer");
			System.out.println("2.Rafael Nadal");
			System.out.println("3.Novak Dojkovic");
			System.out.println("4.Lionel Messi");
			
	    } 

        public static void q2()
	    {
           System.out.println("Which is the largest country in the world?");
			System.out.println("1.India");
			System.out.println("2.New York");
			System.out.println("3.Russia");
			System.out.println("4.USA");
	    } 
	    
	    public static void q3()
	    {
            System.out.println("Which planet is the closest to the sun?");
			System.out.println("1.Moon");
			System.out.println("2.Earth");
			System.out.println("3.Mercury");
			System.out.println("4.Venus");
	    } 

        public static void q4()
	    {
            System.out.println("Which of these is a gas?");
			System.out.println("1.Water");
			System.out.println("2.Hydrogen");
			System.out.println("3.Mercury");
			System.out.println("4.Ballet");
	    } 

		
		
		public static void q5()
	    {
            System.out.println("Which of these social media came in 1998?");
			System.out.println("1.Google");
			System.out.println("2.Facebook");
			System.out.println("3.WWW");
			System.out.println("4.World Wildlife Fund");
	    } 

		
		

}
