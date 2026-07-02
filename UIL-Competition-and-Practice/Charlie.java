import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
public class Charlie {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(new File("charlie.dat"));
        int loops = s.nextInt();
        for(int x=0; x<loops; x++)
        {
        	String letters = s.next();
        	int shift = s.nextInt();
        	int length = letters.length();
        	String newStr = "";
        	char specChar;
        	for(int y=0; y<length; y++)
        	{
        		if(((char)(letters.charAt(y)-shift))<(letters.charAt(0)))
        		{
        			specChar = (char) (((letters.charAt(length-1)+1))-((letters.charAt(0)+1)-(letters.charAt(y)-shift)));
        			newStr +=specChar;
        		}
        		else if(((char)(letters.charAt(y)-shift))>=((letters.charAt(length-1)+1)))
        		{
        			specChar = (char) ((letters.charAt(0)+1)+((letters.charAt(length-1)+1)-(letters.charAt(y)-shift)));
        			newStr +=specChar;
        		}
        		else
        		{
        			newStr+=(char)(letters.charAt(y)-shift);
        		}
        	}
        	System.out.println(newStr);
        }
        
        s.close();
    }
}