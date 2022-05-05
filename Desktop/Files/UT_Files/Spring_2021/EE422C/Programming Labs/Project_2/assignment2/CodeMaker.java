/*
 * EE422C Project 2 (Mastermind) submission by
 * Jan C. Rubio
 * jcr4698
 * Slip days used: 0
 * Spring 2021
 */

package assignment2;

import java.util.ArrayList;
import java.util.List;

public class CodeMaker
{
	private String secretCode;
	private int attempts;
	private String[] availColors;
	private List<String> history;
	
	private boolean win;
	
	public CodeMaker(String secretCode, int attempts, String[] availColors)
	{
		this.secretCode = secretCode;
		this.attempts = attempts;
		this.availColors = availColors;
		history = new ArrayList<String>();
		win = false;
	}
	
	public void setCode(String secretCode)
	{
		this.secretCode = secretCode;
	}
	
	public String getCode()
	{
		return secretCode;
	}
	
	public String response(String guess)
	{
		//invalid input
		if((guess.length() != secretCode.length()) || !realColors(guess))
			return ""; //exit
		
		//continue
		int[] response = new int[2];
		
		//check for input errors
		String[] guessArr = guess.trim().split("");
		String[] codeArr = secretCode.trim().split("");
		
		//check for black pegs
		for(int i = 0; i < guessArr.length; i++)
		{
			if(guessArr[i].equals(codeArr[i]))
			{
				response[0]++;
				guessArr[i] = "-";
				codeArr[i] = "+";
			}
		}
		
		//check for white pegs
		for(int i = 0; i < guessArr.length; i++)
		{
			if(!guessArr[i].equals("-"))
			{
				for(int j = 0; j < codeArr.length; j++)
				{
					if(codeArr[j].equals(guessArr[i]))
					{
						response[1]++;
						guessArr[i] = "-";
						codeArr[j] = "+";
					}
				}
			}
		}
		String printResponse = guess + " -> " + response[0] + "b_" + response[1] + "w ";
		history.add(printResponse);
		return printResponse;
	}
	
	public boolean check(String guess)
	{
		if(guess.equals(secretCode))
		{
			win = true;
			return false;
		}
		else if(guess.equals("HISTORY"))
		{
			showHistory();
			return true;
		}
		else if((guess.length() != secretCode.length()) || !realColors(guess))
		{
			System.out.println("INVALID_GUESS");
			System.out.println();
			return true;
		}
		else if(attempts == 1)
		{
			return false;
		}
		System.out.println();
		System.out.println();
		attempts--;
		return true;
			
	}
	
	private boolean realColors(String guess)
	{
		int colorCount = 0;
		String[] guessArr = guess.trim().split("");
		for(int i = 0; i < guessArr.length; i++)
		{
			for(int j = 0; j < availColors.length; j++)
			{
				if(guessArr[i].equals(availColors[j]))
				{
					colorCount++;
				}
			}
		}
		if(colorCount < secretCode.length())
		{
			return false;
		}
		return true;
	}
	
	public void showHistory()
	{
		for(int i = 0; i < history.size(); i++)
		{
			System.out.println(history.get(i));
		}
		System.out.println();
	}
	
	public int getAttempts()
	{
		return attempts;
	}
	
	public boolean getResult()
	{
		history.clear();
		return win;
	}
}
