import java.util.Scanner;
public class Runway
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		double distance1;
		double time1;
		System.out.println("Please enter a distance in meters for velocity");
		distance1 = reader.nextDouble();
		System.out.println("Please enter a time in seconds for velocity");
		time1 = reader.nextDouble();
		System.out.print("The distance you chose was " + distance1);
		System.out.print(" meters and the time you chose was " + time1);
		System.out.println(" seconds");
		double velocity = distance1 / time1;
		System.out.println("The velocity of those is " + velocity);
		
	}
}
