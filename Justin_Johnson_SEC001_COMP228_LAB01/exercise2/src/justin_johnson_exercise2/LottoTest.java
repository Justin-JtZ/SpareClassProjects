package justin_johnson_exercise2;

//Assignment 2
//Exercise #2

import java.security.SecureRandom;

public class LottoTest{

	//Generate random numbers for lottery system
	private static final SecureRandom randomNumbers = new SecureRandom();

	//Current play statuses for game
	private enum Status {CONTINUE, WON, LOST};                


public static void main(String[] args) {

	int myTicket = ticketNumbers(); //Draw Lottery Ticket
	System.out.printf("You need %d to WIN! %n%n", myTicket);
   	int attempts = 1;	//Record Total Number of Draws
   	int lottoDraw = ticketNumbers(); //Draw Lottery Number
   	Status gameStatus = Status.CONTINUE;

	//While Game is not Complete
	while (gameStatus == Status.CONTINUE) { // not WON or LOST
		lottoDraw = ticketNumbers(); //Draw Again
		++attempts;

		if (attempts == 5) {	//Run out of tries
			gameStatus = Status.LOST;
		}

		// determine game status
		else if (lottoDraw == myTicket) { //Win Condition
			gameStatus = Status.WON;
		}

		else{
			gameStatus = Status.CONTINUE;
		} 
	}

      //Display W/L Message
      if (gameStatus == Status.WON) {
         System.out.println("BIG WIN!!!!");
      } 
      else {
         System.out.println("Sorry. You Lose. =(");
      } 
   
}


//Generates 3 Numbers for Lottery
public static int ticketNumbers() {

	int[] array = new int[3];

	for (int counter = 0; counter < array.length; counter++) {

		//Generate Random Lottery Numbers
		array[counter] = 1 + randomNumbers.nextInt(9);
	}

	int lottoWin = array[0] + array[1] + array[2];

	//Display Required Winning Total
	System.out.printf("Your Lucky Numbers are: %d, %d, %d. Total: %d %n", array[0], array[1], array[2], lottoWin);

	return lottoWin; 
}
}