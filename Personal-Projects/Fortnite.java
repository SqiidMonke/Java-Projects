import java.util.*;
public class Fortnite 
{
	static Scanner reader = new Scanner(System.in);
	static Random rand = new Random();
	
	static Fortnite Player = new Fortnite();
	static Integer[] slotsValue = {1,1,1,1,1};
	static String[] slots = {"common", "common", "common", "common", "common"};
	static int item, slotChoice, rarityValue, total=5, rounds = 6, cRound=0;
	static double opponent;
	static String rarity, choice;
	public static void main(String [] args)
	{
		for(int x=0; x<1; x+=0)
		{
			chest();
			System.out.println("\nGun Rarity >> " + rarity);
			useItem();
			if(choice.compareTo("yes")==0)
			{
				setSlot();
				total();
			}
			System.out.println("Moving on to next fight . . .\n-------------------------------------");
			opponent = rand.nextDouble((Math.sqrt(total)*2));
			if(opponent>=rand.nextDouble(total))
			{
				System.out.println("You lost! GAME OVER\nYou made it to round " + (cRound+1));
				break;
			}
			else
			{
				cRound++;
				System.out.println("You won! Continue Playing >>\nonly " + (rounds - cRound) + " rounds left.");
			}
			if(cRound == rounds)
			{
				System.out.println("You got 1st place! Congratulations");
				break;
			}
		}
	}
	
	public static void chest()
	{
		item = rand.nextInt(99)+1;
		if(item<41)
		{
			rarity = "common";
			rarityValue = 1;
		}
		else if(item>=41&&item<66)
		{
			rarity = "uncommon";
			rarityValue = 2;
		}
		else if(item>=66&&item<81)
		{
			rarity = "rare";
			rarityValue = 3;
		}
		else if(item>=81&&item<91)
		{
			rarity = "epic";
			rarityValue = 4;
		}
		else if(item>=91&&item<97)
		{
			rarity = "legendary";
			rarityValue = 5;
		}
		else 
		{
			rarity="mythic";
			rarityValue = 6;
		}
	}
	
	public static void useItem()
	{
		System.out.println("\nInventory\nSlot 1 >> " + slots[0] + " || Slot 2 >> " + slots[1] + " || Slot 3 >> " + slots[2] + " || Slot 4 >> " + slots[3] + " || Slot 5 >> " + slots[4] + "||");
		System.out.println("Would you like to put this gun in a slot?");
		choice = reader.next().toLowerCase();
	}
	
	public static void setSlot()
	{
		for(int i=0; i<1;i+=0)
		{
			System.out.println("Select a slot you wish to put your gun in (1-5)");
			slotChoice = reader.nextInt();
			if(slotChoice>0&&slotChoice<6)
			{
				slotsValue[slotChoice-1] = rarityValue;
				slots[slotChoice-1] = rarity;
				i++;
			}
			else
			{
				System.out.println("try again");
			}
		}
	}
	
	public static void total()
	{
		total = slotsValue[0];
		for(int x=1;x<slotsValue.length;x++)
		{
			total+=slotsValue[x];
		}
		System.out.println("Your Total >> " + total + "\n-------------------------------------");
	}
}