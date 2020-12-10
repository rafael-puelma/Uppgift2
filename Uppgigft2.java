package uppgift2;

import java.util.Random;
import java.util.Scanner;

// Spela mot datorn
public class Uppgigft2 {

	public static void main(String[] args) {

		// mina variabler
		
		Scanner Scanner = new Scanner(System.in);
		Random random = new Random();
		int computerScore = 0;
		int playerScore = 0;
		int counter = 0;

				
		while (counter == 0) {
			// Dator väljer
			int computerChoice = 1 + random.nextInt(3);
			String computer="";
			
			if (computerChoice==1) {
				 computer = "Paper";
			}else if(computerChoice==2) {
				computer = "Scissors";
			}else if(computerChoice==3) {
				computer = "Rock";
			}
			
			// Spel instruktioner
			System.out.println("");
			System.out.println("Remember that; ");
			System.out.println("Number 1 is Paper");
			System.out.println("Number 2 is Scissors");
			System.out.println("Number 3 is Rock");

				// spelaren väljer
			System.out.println("Pleace choose one");
			String playerChoice = Scanner.nextLine();

			int reallChoice = 0;
			String player ="";
			
			try {
				reallChoice = Integer.parseInt(playerChoice);
			} catch (NumberFormatException e) {
				
				if(playerChoice.equalsIgnoreCase("Paper")) {
				reallChoice = 1;
				player ="Paper";
				}else if(playerChoice.equalsIgnoreCase("Scissors")) {
				reallChoice = 2;
				player ="Scissors";
				}else if(playerChoice.equalsIgnoreCase("Rock")) {
				reallChoice = 3;
				player ="Rock";
				}else{
					System.out.println("Wrong input, Please choose the correct input");
				}
		
			}
			System.out.println(reallChoice);

			if (reallChoice==computerChoice) {

				System.out.println("Player choose " + player);
				System.out.println("Computer choose " + computer);
				System.out.println("It was a Tie, no body wins");

			} else if (reallChoice == 1) {
				if (computerChoice == 2) {
					System.out.println("the the player choose " + player);
					System.out.println("the computer choose " + computer);
					System.out.println("Computer choose Scissors, You loose");
					computerScore++;
					System.out.println("Player score; " + playerScore);
					System.out.println("Computer score; " + computerScore);
					
				} else if (computerChoice == 3) {
					System.out.println("the the player choose " + player);
					System.out.println("the computer choose " + computer);
					System.out.println("Computer choose Rock, You win");
					playerScore++;
					System.out.println("Player score; " + playerScore);
					System.out.println("Computer score; " + computerScore);
				}

			} else if (reallChoice == 2) {
				if (computerChoice == 1) {
					System.out.println("the the player choose " + player);
					System.out.println("the computer choose " + computer);
					System.out.println("Computer choose Scissors, win");
					playerScore++;
					System.out.println("Player score; " + playerScore);
					System.out.println("Computer score; " + computerScore);

				} else if (computerChoice == 3) {
					System.out.println("the the player choose " + player);
					System.out.println("the computer choose " + computer);
					System.out.println("Computer choose Rock, You loose");
					computerScore++;
					System.out.println("Player score; " + playerScore);
					System.out.println("Computer score; " + computerScore);

				}
			} else if (reallChoice == 3) {
				if (computerChoice == 1) {
					System.out.println("the the player choose " + player);
					System.out.println("the computer choose " + computer);
					System.out.println("Computer choose Paper,you loose");
					computerScore++;
					System.out.println("Player score; " + playerScore);
					System.out.println("Computer score; " + computerScore);

				} else if (computerChoice == 2) {
					System.out.println("the the player choose " + player);
					System.out.println("the computer choose " + computer);
					System.out.println("Computer choose Rock, You win");
					playerScore++;
					System.out.println("Player score; " + playerScore);
					System.out.println("Computer score; " + computerScore);
				}
			}else {
					System.out.print("Please pic a number between 1 to 3");
				}
			if (playerScore == 3) {
				System.out.println("Congratiolation, You win");
				counter++;

			}
			if (computerScore == 3) {
				System.out.println("Sorry, You loose");
				counter++;
			}
			System.out.println("looped");
		}
	}
}