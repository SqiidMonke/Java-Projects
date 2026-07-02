import java.util.*;
import java.io.*;
public class pre_written_test 
{
	public static void main(String [] args) throws Exception
	{
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new File("output.txt"));
		int par1 = in.nextInt();
		int par2 = in.nextInt();
		int par3 = in.nextInt();
		int [][][] arr = new int[par1][par2][par3];
		for(int x=0; x<par1;x++)
		{
			for(int y=0; y<par2;y++)
			{
				for(int z=0; z<par3;z++)
				{
					arr[x][y][z] = x+y+z;
				}
			}
		}
		
		System.out.println(print(arr, par1, par2, par3));
		
		in.close();
		out.close();
	}
	public static String print(int[][][] arr, int par1, int par2, int par3)
	{
		String numbs = "";
		for(int x=0; x<par1;x++)
		{
			for(int y=0; y<par2;y++)
			{
				for(int z=0; z<par3;z++)
				{
					numbs += " " + (arr[x][y][z]);
				}
				numbs += "\n";
			}
			numbs+= "\n\n\n";
		}
		return numbs;
	}
}