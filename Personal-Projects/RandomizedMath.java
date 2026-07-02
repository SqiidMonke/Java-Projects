import java.util.*;
public class RandomizedMath 
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		final int STOP = 999;
		for(int mainEntry, i=0; i<1; i+=0)
		{
			System.out.println("Which gamemode would you like to play? >> \n--------------------------------------------------\nPress 1 for addition (up to 100)\nPress 2 for subtraction (up to 50)\nPress 3 for multiplication (up to 144)\nPress 4 for division (up to 10)\n");
			mainEntry = reader.nextInt();
			if(mainEntry==1)
			{
				addition();
			}
			else if(mainEntry==2)
			{
				subtraction();
			}
			else if(mainEntry==3)
			{
				multiplication();
			}
			else if(mainEntry==4)
			{
				division();
			}
			else
			{
				System.out.println("[Invalid Entry]");
			}
		}
	}
	public static void addition()
	{
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Welcome to gamemode: addition\nEnter 999 to exit out to main menu");
		for(int correct=0, streak = 0, highScore = 0, answer, sum, firstNumb, secondNumb, x=0; x<1; x+=0)
		{
			sum = rand.nextInt(99)+2;
			firstNumb = rand.nextInt(sum)+1;
			secondNumb = sum - firstNumb;
			System.out.println("What is " + firstNumb + " + " + secondNumb + " >> ");
			answer = reader.nextInt();
			if(answer==999)
			{
				System.out.println("You got a total of >> [" + correct + "] correct\nYour highschore was a >> [" + highScore + "] answer streak\nHeading back to Main Menu . . .\n\n");
				break;
			}
			if(answer==sum)
			{
				System.out.println("You got it right!\n");
				correct++;
				streak++;
				if(streak>highScore)
				{
					highScore=streak;
				}
			}
			else
			{
				System.out.println("You got it wrong! (Answer: [" + sum + "])\n");
				streak=0;
			}
		}
	}
	//==========================================================================
	public static void subtraction()
	{
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Welcome to gamemode: subtraction\nEnter 999 to exit out to main menu");
		for(int correct=0, streak = 0, highScore = 0, answer, sum, firstNumb, secondNumb, x=0; x<1; x+=0)
		{
			sum = rand.nextInt(50)+2; 
			firstNumb = rand.nextInt(100)+1;
			secondNumb = firstNumb - sum;
			System.out.println("What is " + firstNumb + " - " + secondNumb + " >> ");
			answer = reader.nextInt();
			if(answer==999)
			{
				System.out.println("You got a total of >> [" + correct + "] correct\nYour highschore was a >> [" + highScore + "] answer streak\nHeading back to Main Menu . . .\n\n");
				break;
			}
			if(answer==sum)
			{
				System.out.println("You got it right!\n");
				correct++;
				streak++;
				if(streak>highScore)
				{
					highScore=streak;
				}
			}
			else
			{
				System.out.println("You got it wrong! (Answer: [" + sum + "])\n");
				streak=0;
			}
		}
	}
	//==========================================================================
	public static void multiplication()
	{
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Welcome to gamemode: multiplication\nEnter 999 to exit out to main menu");
		for(int correct=0, streak = 0, highScore = 0, answer, sum, firstNumb, secondNumb, x=0; x<1; x+=0)
		{
			firstNumb = rand.nextInt(12)+1;
			secondNumb = rand.nextInt(12)+1;
			sum = firstNumb*secondNumb;
			System.out.println("What is " + firstNumb + " x " + secondNumb + " >> ");
			answer = reader.nextInt();
			if(answer==999)
			{
				System.out.println("You got a total of >> [" + correct + "] correct\nYour highschore was a >> [" + highScore + "] answer streak\nHeading back to Main Menu . . .\n\n");
				break;
			}
			if(answer==sum)
			{
				System.out.println("You got it right!\n");
				correct++;
				streak++;
				if(streak>highScore)
				{
					highScore=streak;
				}
			}
			else
			{
				System.out.println("You got it wrong! (Answer: [" + sum + "])\n");
				streak=0;
			}
		}
	}
	//==========================================================================
	public static void division()
	{
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Welcome to gamemode: division\nEnter 999 to exit out to main menu");
		for(int correct=0, streak = 0, highScore = 0, answer, sum, firstNumb, secondNumb, x=0; x<1; x+=0)
		{
			sum = rand.nextInt(12)+2;
			firstNumb = sum*rand.nextInt(8)+1;
			secondNumb = firstNumb*sum;
			System.out.println("What is " + secondNumb + " / " + firstNumb + " >> ");
			answer = reader.nextInt();
			if(answer==999)
			{
				System.out.println("You got a total of >> [" + correct + "] correct\nYour highschore was a >> [" + highScore + "] answer streak\nHeading back to Main Menu . . .\n\n");
				break;
			}
			if(answer==sum)
			{
				System.out.println("You got it right!\n");
				correct++;
				streak++;
				if(streak>highScore)
				{
					highScore=streak;
				}
			}
			else
			{
				System.out.println("You got it wrong! (Answer: [" + sum + "])\n");
				streak=0;
			}
		}
	}
}