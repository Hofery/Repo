import java.util.Scanner;

public class RandomNumberGuesser
{


  public static void main (String[]args)
  {

    String x = "";


    do
      {

	int nextGuess;

	int randNum = RNG.rand ();

	int lowGuess = 0;

	int highGuess = 100;

	Scanner scan = new Scanner (System.in);

	Scanner answer = new Scanner (System.in);

	  System.out.println ("Random Number Guesser");

	  System.out.println ("Enter your first guess between 0-100");


	do
	  {

	    nextGuess = scan.nextInt ();

	    boolean inBounds =
	      RNG.inputValidation (nextGuess, lowGuess, highGuess);

	    if ((nextGuess > randNum) && (inBounds == true))
	      {

		highGuess = nextGuess;

		System.out.println ("Number of Guesses: " + RNG.getCount ());

		System.out.println ("Guess is too high");

		System.out.println ("Enter a number between " + lowGuess +
				    " and " + highGuess);


	      }

	    else if ((nextGuess < randNum) && (inBounds == true))
	      {

		lowGuess = nextGuess;

		System.out.println ("Number of Guesses: " + RNG.getCount ());

		System.out.println ("Guess is too low");

		System.out.println ("Enter a number between " + lowGuess +
				    " and " + highGuess);


	      }

	    else
	      {

		System.out.println ("Number of Guesses: " + RNG.getCount ());


	      }

	  }

	while (nextGuess != randNum);

	System.out.println ("You win");

	System.out.println ("Do you want to play again? (Yes or No)");

	RNG.resetCount ();

	x = answer.nextLine ();


      }

    while (x.equalsIgnoreCase ("Yes"));



    System.out.println ("Thanks for Playing");

    System.out.println ("Coded by Yarden Hofer");
    
  }
  
}
