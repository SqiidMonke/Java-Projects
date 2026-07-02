//importing that scanner class
import java.util.Scanner;
//opening the main class
public class RunwayMinimum
{
	//opening Main Method
	public static void main(String [] args)
	{
		//this section will be mostly the velocity part with little of the stuff being used beyond it
		//creating reader object with the scanner class to accept input
		Scanner reader = new Scanner(System.in);
		//creating variables to be used in the future
		final double number1 = 2;
		double distance1;
		double time1;
		//prompting for input (it will usually be the same in this format in the quote marks: Please enter a (number or something))
		System.out.println("Please enter a distance in meters for velocity");
		//instantiating the previously created variable with the next user input
		distance1 = reader.nextDouble();
		System.out.println("Please enter a time in seconds for velocity");
		time1 = reader.nextDouble();
		//displaying all variables in this section of the code
		System.out.print("The distance you chose was " + distance1);
		System.out.print(" meters and the time you chose was " + time1);
		System.out.println(" seconds");
		//creating a math equation to calculate the velocity using the instantiated variables
		double velocity = distance1 / time1;
		//displaying the outcome
		System.out.println("The velocity of those is " + velocity);
		
		
		//this section will be mostly the acceleration part using some things from the previous section
		//creating more variables to be used
		double distance2;
		double time2;
		//prompting for input
		System.out.println("Please enter a distance in meters for acceleration");
		//instantiating more variables with the next user input
		distance2 = reader.nextDouble();
		System.out.println("Please enter a time in seconds for acceleration");
		time2 = reader.nextDouble();
		//displaying variables
		System.out.print("The distance you chose was " + distance2);
		System.out.print(" meters and the time you chose was " + time2);
		System.out.println(" seconds");
		//creating a new variable that will use the math class to calculate the acceleration with the given values
		double acceleration = distance2 / (Math.pow(time2, 2));
		//displaying the outcome
		System.out.println("The acceleration of those is " + acceleration);
		
		
		//for this final section we will be calculating the minimum run way length possible with the two outcomes that we have produced\
		//creating a calculation that takes some of the numbers we have produced and creating a length
		double runwayLength =  (velocity * number1) / (number1 * acceleration);
		//displaying the final outcome
		System.out.println("The minimum runway length with the given variables is " + runwayLength);
	}
}