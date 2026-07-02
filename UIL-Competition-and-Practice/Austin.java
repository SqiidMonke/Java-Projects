package Main;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Austin {
	public static void main(String[] args) throws IOException
	{
        Scanner scan = new Scanner(new File("placeholder.dat"));
    	int iterations = scan.nextInt();
    	String[] arr = new String[iterations];
    	for(int x=0; x<iterations; x++)
    	{
    		arr[x] = " ";
    	}
    	scan.nextLine();
    	for(int line = 0; line < iterations; line++)
    	{
    		int order = Integer.parseInt(scan.next())-1;
    		arr[order] = scan.nextLine();
    		arr[order] = arr[order].substring(2, arr[order].length()-1);
    	}
    	for(int y = 0; y<iterations; y++)
    	{
    		System.out.print(arr[y]);
    	}
    }
}