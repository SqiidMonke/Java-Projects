package Main;
import java.util.*;
public class Gambling 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int highest=0, lowest=100000, x=0, numb;
		char input;
		System.out.println("Press enter to play, anything else to quit >>");
		while(x<1)
		{
			input = (scan.nextLine() + ' ').charAt(0);
			if(input == ' ')
			{
				numb = rand.nextInt(100001);
				if(numb>highest)
				{
					highest = numb;
				}
				if(numb<lowest)
				{
					lowest = numb;
				}
			}
			else
			{
				System.out.println("Goodbye");
				break;
			}
			System.out.println("\n\n\nNumber:\t" + numb + "\nHighest:\t" + highest + "\nLowest:\t" + lowest + "\n");
			if(highest==100000 && lowest==0)
			{
				System.out.println("\nYou've gotten the best values! Thank you for playing");
				break;
			}
		}
	}
}