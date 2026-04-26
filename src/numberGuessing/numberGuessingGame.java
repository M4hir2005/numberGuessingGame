package numberGuessing;

import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame {

	public static void main(String[] args) {
	//so we'll need a while loop
	//user input with a scanner
	//random numbers
	//printf
	//nestedloop or enhanced swithches
		Random random = new Random();
		int guessedNumber;
		int randomNumber;
		int min;
		int max;
		int attempts = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello and welcome to my number guessing program");
		do {
		System.out.println("Please select your min number(whole number):");
		min = scanner.nextInt();
		System.out.println("Please select your max number(whole number):");
		max = scanner.nextInt();

		if (min > max) {
			System.out.println("Please select suitable max and min values");
		} else {
			System.out.println("Please guess a number(a whole number between min-max)");
		}
		} while (max < min);
		
		
		randomNumber = random.nextInt(min, max+1);
		
		do {
			attempts++;
			guessedNumber = scanner.nextInt();
			if (guessedNumber > randomNumber) {
				System.out.println("Your number is too HIGH");
				System.out.println("Please try again");
			} else if (guessedNumber < randomNumber) {
				System.out.println("Your number is too LOW");
				System.out.println("Please try again");
			} else
			{System.out.println("Ding Ding Ding correct");
			System.out.println("it took you " + attempts + " attempts");
			}

		} while(!(randomNumber == guessedNumber));

	}

}
