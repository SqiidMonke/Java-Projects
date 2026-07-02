package Main; //no external code used, code written entirely by me
import java.util.*;
public class Hangman 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String[] words = {"apple", "banana", "aussie", "computer", "science", "chicken", "english", 
		"orange", "microwave", "chocolate", "zebra", "sports", "train", "lunchbox", "airplane", "jacket"}; //line break for readability
		
		String word = words[rand.nextInt(words.length)];
		String unknown = "";
		char guess;
		int guesses = 0;
		
		for(int x=0; x<word.length(); x++)
		{
			unknown += "*";
		}
		
		System.out.println("Welcome to Hangman! A word has been chosen\nYou may begin guessing letters");
		
		while(unknown.contains("*")==true)
		{
			System.out.println("Enter your next guess >>");
			guess = scan.next().toLowerCase().charAt(0);
			if(("" + guess).matches("[a-z]"))
			{
				guesses++;
				if(check(guess, word)==true)
				{
					System.out.println("You matched a letter!");
					unknown = edit(guess, word, unknown);
				}
				else
				{
					System.out.println("No matches! Try Again.");
				}

				System.out.println("\nCurrent Progress: " + unknown + "\nGuesses: " + guesses + "\n");
			}
			else
			{
				System.out.println("Invalid character, please try again");
			}
		}
		
		System.out.println("Congrats! You have guessed the word: " + word + "\nIt took you " + guesses + " guesses to solve it.");
	}
	
	public static Boolean check(char guess, String word)
	{
		for(int x=0; x<word.length(); x++)
		{
			if((word.charAt(x)) == guess)
			{
				return true;
			}
		}
		return false;
	}
	
	public static String edit(char guess, String word, String unknown)
	{
		for(int x=0; x<word.length(); x++)
		{
			if((word.charAt(x)) == guess)
			{
				char[] temp = unknown.toCharArray();
				temp[x] = guess;
				unknown = new String(temp);
			}
		}
		return unknown;
	}
}