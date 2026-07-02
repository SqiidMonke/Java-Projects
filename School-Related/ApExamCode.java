package Main;
import java.util.*;
public class ApExamCode
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String[] happyNoun = {"flower", "butterfly", "rainbow", "unicorn", "cement", "sunshine", "dog", "bunny", "kitty", "puppy", "wildflower", "kittens", "puppies", "christmas tree", "easter bunny", "duck", "rollercoaster", "chick", "waffle", "horsie", "pony", "sun", "lollipop", "carpet", "icecream", "snowcone"};
		String[] sadNoun = {"tax", "rain", "cold spaghetti", "vomit", "uncooked ramen", "bomb", "cancer", "sickness", "thundercloud", "haunted house", "bad wifi", "cracked egg", "grim reaper", "curse", "pollution", "dead rose", "spilled milk", "sour milk", "tears", "frowny face", "mean person", "mean people"};
		String[] happyAdj = {"happy", "smiley", "bountiful", "captivating", "inspriring", "gleeful", "joyful", "colorful", "thoughtful", "kind", "smiling", "jumping", "optomistic", "pretty", "helpful", "bright", "awesome", "improving", "wonderful", "adventurous", "comforting"};
		String[] sadAdj = {"sad", "frowning", "mean", "cruel", "pessimistic", "depressed", "demonizing", "dissapointing", "demanding", "doubtful", "gloomy", "shady", "mischevious", "hurtful", "condescending", "mordbid", "eerie", "creepy", "devastating", "aggravating", "malicious", "scary", "insulting", "depriving", "palpatating"};
		String[] moveVerb = {"bounded", "ran", "walked", "sprinted", "crawled", "rolled", "creeped", "strolled"};
		
		for(int x=0; x<1; x+=0)
		{
		System.out.println("Input [0] for a happy sentence, [1] for a sad sentence >>");
		int input = (int) Math.signum(scan.nextDouble());
		if(input < 0)
		input = 0;
		
		if(input == 0)
		System.out.println("The " + happyAdj[rand.nextInt(happyAdj.length)] + " " + happyNoun[rand.nextInt(happyNoun.length)] + " " + moveVerb[rand.nextInt(moveVerb.length)] + " to the " + happyAdj[rand.nextInt(happyAdj.length)] + " " + happyNoun[rand.nextInt(happyNoun.length)]);
		
		else
			System.out.println("The " + sadAdj[rand.nextInt(sadAdj.length)] + " " + sadNoun[rand.nextInt(sadNoun.length)] + " " + moveVerb[rand.nextInt(moveVerb.length)] + " to the " + sadAdj[rand.nextInt(sadAdj.length)] + " " + sadNoun[rand.nextInt(sadNoun.length)]);
		}
	}
}