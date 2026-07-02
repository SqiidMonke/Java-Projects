import java.util.*;
public class Longest_Streak 
{
	public static void main(String [] args)
	{
		int streak=0, longest=0, selection, prevSelection=0, xLoc = 0, yLoc=0;
		Random rand = new Random();
		System.out.println("\t1\t9\t17\t25\t33\t41\t49\t57\t65\t73\t81\t89\t97\t105\t113\t121\t129\t137\t145\t153\t161\t169\t177\t185\t193\t201");
		for(int x=0; x<400;x++)
		{
			System.out.print((x+1 + ":\t"));
			for(int y=0; y<200;y++)
			{
				selection = rand.nextInt(2);
				System.out.print(selection);
				if(prevSelection==selection)
				{
					streak++;
					if(streak>longest)
					{
						longest=streak;
						xLoc = x+1;
						yLoc = y+1;
					}
				}
				else
				{
					streak=0;
				}
				prevSelection = selection;
			}
			System.out.println();
		}
		System.out.println("\nThe longest streak of a 0 or 1 was: " + (longest+1) + "\nIt ended at row " + xLoc + " and column " + yLoc);
		
	}
}