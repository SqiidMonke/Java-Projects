import java.util.Scanner;
public class IfStatements 
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int sideA, sideB, sideC;
		System.out.println("Please enter side A of your triangle");
		sideA = reader.nextInt();
		System.out.println("Please enter side B of your triangle");
		sideB = reader.nextInt();
		System.out.println("Please enter side C of your triangle");
		sideC = reader.nextInt();
		double sideAPOW = Math.pow(sideA, 2);
		double sideBPOW = Math.pow(sideB, 2);
		double sideCPOW = Math.pow(sideC, 2);
		double sideABPOW = sideAPOW + sideBPOW;
		System.out.println(sideABPOW + " = " + sideCPOW);
		if(sideABPOW == sideCPOW)
		{
			System.out.println("Your triangle is right");
		}
		else
		{
			System.out.println("Your triangle is not right");
		}
		
		int callLength;
		System.out.println("Enter the length of your call in minutes");
		callLength = reader.nextInt();
		final int callMax = 2;
		if(callLength < callMax)
		{
			double price = 1.15;
			System.out.println("$" + price);
		}
		else if(callLength == 0)
		{
			double price = 0.00;
			System.out.println("$" + price);
		}
		else if(callLength > callMax)
		{
			double time = callLength * .5;
			double price = time + 1.15 - 1;
			System.out.println("$" + price);
		}
		
		int numb1, numb2;
		System.out.println("Please enter a number");
		numb1 = reader.nextInt();
		System.out.println("Please enter another number");
		numb2 = reader.nextInt();
		if(numb1 > numb2)
		{
			System.out.println("number 1 is greater than number 2");
		}
		else
		{
			System.out.println("number 2 is greater than number 1");
		}
		
		String name;
		int age;
		System.out.println("Please enter your name");
		name = reader.next();
		System.out.println(name);
		System.out.println("Please enter your age");
		age = reader.nextInt();
		System.out.println(age);
		if(age < 21)
		{
			System.out.println("Minor");
		}
		else
		{
			System.out.println("Not a Minor");
		}
		
	}
}
