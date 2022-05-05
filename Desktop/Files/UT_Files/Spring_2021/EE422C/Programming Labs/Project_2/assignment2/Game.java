/*
 * EE422C Project 2 (Mastermind) submission by
 * Jan C. Rubio
 * jcr4698
 * Slip days used: 0
 * Spring 2021
 */

package assignment2;

import java.util.Scanner;

public class Game
{
	private boolean testMode;
	private Scanner scanner;
	
	public Game(boolean testMode, Scanner scanner)
	{
		this.scanner = new Scanner(System.in);
		this.testMode = testMode;
	}
	
	public void runGame(GameConfiguration config, SecretCodeGenerator generator)
	{
		System.out.println("Welcome to Mastermind.");
		System.out.println("Do you want to play a new game? (Y/N):");
		String gameSelection = scanner.next();
		CodeMaker code;
		
		//loop
		while(gameSelection.equals("Y"))
		{
			//generate new secret code
			code = new CodeMaker("", config.guessNumber, config.colors);
			code.setCode(generator.getNewSecretCode());
			
			//inputs
			if(testMode) 
			{
				System.out.println();
				System.out.println("Secret Code: " + code.getCode());
			}
			System.out.println();
			System.out.println("You have " + config.guessNumber + " guess(es) left. ");
			System.out.println("Enter guess:");
			String guess = scanner.next();
			System.out.print(code.response(guess));
			
			//process user's guess
			while(code.check(guess))
			{
				System.out.println("You have " + code.getAttempts() + " guess(es) left. ");
				System.out.println("Enter guess:");
				guess = scanner.next();
				System.out.print(code.response(guess));
			}
			if(code.getResult())
				System.out.println("You win!");
			else
				System.out.println("You lose! The pattern was " + code.getCode());
			
			System.out.println();
			System.out.println("Do you want to play a new game? (Y/N):");
			gameSelection = scanner.next();
		}
	}
}
