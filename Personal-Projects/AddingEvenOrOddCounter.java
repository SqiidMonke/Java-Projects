import java.util.*;
public class AddingEvenOrOddCounter
{
	public static void main(String [] args)
	{
		Random rand = new Random();
		int var1, var2, sum, evens=0, odds=0, margin;
		for(int x = 0; x<100000;x++)
		{
			var1 = rand.nextInt(10000);
			var2 = rand.nextInt(10000);
			sum = var1 + var2;
			if(sum%2==0)
			{
				evens++;
			}
			else
			{
				odds++;
			}
		}
		
		System.out.println("Evens:\t" + evens + "\nOdds:\t" + odds);
		
		if(odds/10000==5)
		{
			margin = odds-evens;
			evens = evens/50000+1;
			odds/=50000;
		}
		else
		{
			margin = evens-odds;
			odds = odds/50000+1;
			evens/=50000;
		}
		
		System.out.println("Simplified Ratio: " + evens + " : " + odds + "\nThe Margin between the two was: " + margin);
	}
}
