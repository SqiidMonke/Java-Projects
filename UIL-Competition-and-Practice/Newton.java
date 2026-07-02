import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Newton {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(new File("newton.dat"));
        int numPyr = s.nextInt();
        for(int x = 0; x<numPyr;x++)
        {
        	int layers = s.nextInt();
        	for(int z=0; z<layers;z++)
        	{
        		for(int y=(layers-z+1)-2; y>0; y--)
        		{
        			System.out.print(" ");
        		}
        		for(int f=0;f<=((z+1)*2)-2;f++)
        		{
        			System.out.print("*");
        		}
        		System.out.println();
        	}
        	System.out.println();
        }

        s.close();
    }
}