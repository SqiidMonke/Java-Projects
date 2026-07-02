import java.util.Scanner;
public class Page197 
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int evenOddNumb;
		System.out.println("Please enter a number");
		evenOddNumb = reader.nextInt();
		int evenOddNumbCheck = evenOddNumb % 2;
		if(evenOddNumbCheck == 0)
		{
			System.out.println("Your number is even");
		}
		else
		{
			System.out.println("Your number is odd");
		}
		
		int numb1, numb2, numb3, least, middle, greatest;
		System.out.println("Please enter three numbers");
		numb1 = reader.nextInt();
		numb2 = reader.nextInt();
		numb3 = reader.nextInt();
		if((numb1 > numb2)&&(numb1 > numb3))
		{
			greatest = numb1;
			System.out.println(greatest + " is the greatest");
		}
		if(((numb3>numb1)&&(numb1>numb2))||(numb2>numb1)&&(numb1>numb3))
		{
			middle = numb1;
			System.out.println(middle + " is the middle");
		}
		if((numb1 < numb2)&&(numb1 < numb3))
		{
			least = numb1;
			System.out.println(least + " is the least");
		}
		
		if((numb2 > numb1)&&(numb2 > numb3))
		{
			greatest = numb2;
			System.out.println(greatest + " is the greatest");
		}
		if(((numb3>numb2)&&(numb2>numb1))||(numb1>numb2)&&(numb2>numb3))
		{
			middle = numb2;
			System.out.println(middle + " is the middle");
		}
		if((numb2 < numb1)&&(numb2 < numb3))
		{
			least = numb2;
			System.out.println(least + " is the least");
		}
		
		if((numb3 > numb2)&&(numb3 > numb1))
		{
			greatest = numb3;
			System.out.println(greatest + " is the greatest");
		}
		if(((numb1>numb3)&&(numb3>numb2))||(numb2>numb3)&&(numb3>numb1))
		{
			middle = numb3;
			System.out.println(middle + " is the middle");
		}
		if((numb3 < numb2)&&(numb3 < numb1))
		{
			least = numb3;
			System.out.println(least + " is the least");
		}
		
		double input, viewInput, price;
		System.out.println("Press 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch");
		input = reader.nextInt();
		if(input==1)
		{
			System.out.println("Press one for a lake view and 2 for a park view");
			viewInput = reader.nextDouble();
			if(viewInput==2)
			{
				price = 125;
				System.out.printf("The price is $%.2f" ,price);
			}
			else
			{
				price = 125+15;
				System.out.printf("The price is $%.2f" ,price);
			}
		}
		else if(input==2)
		{
			System.out.println("Press one for a lake view and 2 for a park view");
			viewInput = reader.nextDouble();
			if(viewInput==2)
			{
				price = 125;
				System.out.printf("The price is $%.2f" ,price);
			}
			else
			{
				price = 139+15;
				System.out.printf("The price is $%.2f" ,price);
			}
		}
		
		else if(input==3)
		{
			System.out.println("Press one for a lake view and 2 for a park view");
			viewInput = reader.nextDouble();
			if(viewInput==2)
			{
				price = 125;
				System.out.printf("The price is $%.2f" ,price);
			}
			else
			{
				price = 165+15;
				System.out.printf("The price is $%.2f" ,price);
			}
		}
		else
		{
			price = 0;
			System.out.println("Invalid");
			System.out.printf("The price is $%.2f" ,price);
		}
	
	}
}
