import java.util.Scanner;


public class CoinFlip{

	
	public static void main(String[]args){
		
			Scanner scan = new Scanner(System.in);
				int score = 0;
			
				System.out.println("Welcome to the Coin Flip Challenge!!");
				System.out.println("What is your name?");
				
					String playerName = scan.nextLine();
					
						System.out.println("Hello " + playerName + ". Do you want to play the Coin Flip Challenge? yes/no");
						
					String answer = scan.next();
									
						if(answer.equalsIgnoreCase("yes")) {
							//begin loop
							for(int i=0; i<5; i++) {
								
								System.out.println("Heads or Tails?");
								
								String guessOne = scan.next(); //first round guess
														
									
								
								Coin coin = new Coin(); //called from other class in file
								
								coin.flip();
								System.out.println("lets see... " + coin.toString());
									
									if(coin.isHeads() && guessOne.equalsIgnoreCase("heads")) {
										score++;
									
											System.out.println("Congratulations, you're right!");
													
									}else if(coin.isHeads()&& guessOne.equalsIgnoreCase("tails")) {
											
										System.out.println("Sorry, not this time.");
										
									}else if(coin.isHeads()==false && guessOne.equalsIgnoreCase("tails")) {
										score++;
										
											System.out.println("Congratulations, you're right!");
											
									}else if(coin.isHeads()==false && guessOne.equalsIgnoreCase("heads")) {
										
										System.out.println("Sorry, not this time.");
									}
							
							} //end loop	
							
						}else if(answer.equalsIgnoreCase("no")){
							System.out.println("You're a coward, " + playerName + "!");
						}
						
					
						System.out.println("Wow, " + playerName + " you have a final score of " + score + "!");

	
	}
				
}
	
			
		
	

