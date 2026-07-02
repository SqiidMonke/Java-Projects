package Main;
import java.util.*;
public class ChickParade 
{
	public static void main(String [] args)
	{
		System.out.println("How many chicks?");
		Scanner scan = new Scanner(System.in);
		int chicks = scan.nextInt();
		for(int x=0; x<chicks; x++)
		{
			System.out.print(" _  ");
		}
		System.out.println();
		for(int x=0; x<chicks; x++)
		{
			System.out.print("(*> ");
		}
		System.out.println();
		for(int x=0; x<chicks; x++)
		{
			System.out.print("//\\ ");
		}
		System.out.println();
		for(int x=0; x<chicks; x++)
		{
			System.out.print("V_/_");
		}
		System.out.println("\n\ntweet tweet!!");
	}
}
