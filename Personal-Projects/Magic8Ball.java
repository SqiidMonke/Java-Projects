import java.util.*;
public class Magic8Ball 
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		String[] Responses = {"Never", "In your dreams", "Nah", "Absolutely Not", "No", "Doubtful", "Unlikely", "Probably Not", "Maybe", "Barely", "Sure", "Probably", "Likely", "Yes", "Of course", "Affirmative", "Defintiely", "100%", "Wihtout a Doubt", "Ask again"};
		for(int x=0; x<1;x+=0)
		{
			System.out.println("Ask a yes or no questions, or enter 99 to quit >>");
			String question = reader.nextLine();
			final String EXIT = "99";
			int compare = EXIT.compareTo(question);
			if(compare==0)
			{
				System.out.println("Thanks for playing");
				break;
			}
			else
			{
				int randNumb = rand.nextInt(20);
				System.out.println(Responses[randNumb]);
			}
		}
	}
}