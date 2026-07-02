import java.util.*;
public class SinWaveChart
{
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String [] args)
	{
		String[][] graph = new String[11][39];
		for(int y = 0; y<11; y++)
		{
			for(int x = 0; x<39; x++)
			{
				graph[y][x] = "_";
			}
		}
		int cosSin = chooseCosSin();
		double rads = chooseInput();
		point(graph, cosSin, rads);
	}
	
	private static int chooseCosSin()
	{
		System.out.println("sine wave (0), or cosine wave (1)\nenter either 0, or 1 >>");
		int sincos = scan.nextInt();
		if(sincos<=0)
		{
			sincos = 0;
		}
		else
		{
			sincos = 1;
		}
		return sincos;
	}
	private static double chooseInput()
	{
		System.out.println("degrees (0), or radians (1)\nenter either 0, or 1 >>");
		int raddeg = scan.nextInt();
		double input;
		if(raddeg<=0)
		{
			System.out.println("Enter how many degrees >>");
			input = scan.nextDouble();
			input = Math.toRadians(input);
		}
		else
		{
			System.out.println("Enter how many radians >>");
			input = scan.nextDouble();
		}
		return input;
	}
	
	private static String[][] point(String[][] arr, int sincos, double rads)
	{
		int y;
		if(sincos==0)
		{
			y = (int)Math.round((Math.sin(rads))*5+5);
		}
		else
		{
			y = (int)Math.round((Math.cos(rads))*5+5);
		}
		rads = rads - ((4*Math.PI)*(Math.floor(rads/(4*Math.PI))));//makes it between 0 and 4PI
		int x = (int) Math.floor((rads/(4*Math.PI))*39);
		System.out.println(x + "\n" + y);
		arr[10-y][x] = "#";
		System.out.println();
		for(int g = 0; g<11; g++)
		{
			for(int f = 0; f<39; f++)
			{
				System.out.print("[" + arr[g][f] + "] ");
			}
			System.out.println();
		}
		for(int z=0; z<37;z++)
		{
			System.out.print(" ");
		}
		System.out.print("PI");
		for(int z=0; z<37;z++)
		{
			System.out.print(" ");
		}
		System.out.print("2PI");
		for(int z=0; z<37;z++)
		{
			System.out.print(" ");
		}
		System.out.print("3PI");
		for(int z=0; z<33;z++)
		{
			System.out.print(" ");
		}
		System.out.print("4PI");
		return arr;
	}
}