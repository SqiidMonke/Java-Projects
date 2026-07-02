package Main;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Logan 
{
	public static void main(String[] args) throws IOException
	{
        Scanner Steve = new Scanner(new File("logan.dat"));
        int numLoops=Steve.nextInt();
        for(int i=0; i<numLoops; i++) {
        	int vertical=Steve.nextInt();
        	int horizontal=Steve.nextInt();
        	int[][] arr = new int[vertical][horizontal];
        	int threshhold=Steve.nextInt();
        	int smelliest=0;
        	for(int x=0; x<vertical; x++) {
        		for(int y=0; y<horizontal; y++) {
        			int currentVal=Steve.nextInt();
        			arr[x][y] = currentVal;
        			if (currentVal>smelliest) {
        				smelliest=currentVal;
        			}
        		}
        	}
        	String coords="";
        	for(int x=0; x<vertical; x++) {
        		for(int y=0; y<horizontal; y++)
        		{
        			if(arr[x][y]==smelliest)
        			{
        				coords+=("(" + (x+1) + "," + (y+1) + ") ");
        			}
        		}
        	}
        	String[][] dangerMap=new String[vertical][horizontal];
        	for(int a=0; a<vertical; a++) {
        		for(int b=0; b<horizontal; b++) {
        			if (arr[a][b]>=threshhold) {
        				dangerMap[a][b]="X";
        			}
        			else dangerMap[a][b]=".";
        		}
        	}
        	System.out.println("--- Hazard Map Case "+(i+1)+" ---");
        	System.out.println("Grid:");
        	for(int x=0; x<vertical; x++) {
        		for(int y=0; y<horizontal; y++) {
        			System.out.printf("%3d" ,arr[x][y]);
        		}
        		System.out.println("");
        	}
        	System.out.println("Smelliest value: "+smelliest);
        	System.out.println("Location(s) : "+coords);
        	System.out.println();
        	System.out.println("Danger Map:");
        	for(int x=0; x<vertical; x++) {
        		for(int y=0; y<horizontal; y++) {
        			System.out.print(dangerMap[x][y]+" ");
        		}
        		System.out.println("");
        	}
        }
	}
}