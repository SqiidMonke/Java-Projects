public class Loops
{
	public static void main(String [] args)
	{
		final int START = 5;
		final int END = 505;
		int loopCount = START;
		while(loopCount < END)
		{
			System.out.print(loopCount + " ");
			loopCount+=5;
			double remainder = ((loopCount - 5)% 50);
			if(remainder < 1)
			{
				System.out.println();
			}
		}
	}
}
