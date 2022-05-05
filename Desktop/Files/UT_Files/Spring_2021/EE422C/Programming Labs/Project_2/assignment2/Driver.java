/*
 * EE422C Project 2 (Mastermind) submission by
 * Jan C. Rubio
 * jcr4698
 * Slip days used: 0
 * Spring 2021
 */

package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args)
    {
    	String[] colorArr = {"R", "G", "B", "O", "Y", "P"};
		GameConfiguration game = new GameConfiguration(10, colorArr, 4);
		SecretCodeGenerator secretCode = new SecretCodeGenerator(game);
		start(true, game, secretCode);
    }

    public static void start(Boolean isTesting, GameConfiguration config, SecretCodeGenerator code) 
    {
    	Scanner jan = new Scanner(System.in);
    	Game game = new Game(isTesting, jan);
    	game.runGame(config, code);
    }
}
