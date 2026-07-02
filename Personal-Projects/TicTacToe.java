import java.util.*;
public class TicTacToe 
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		String[][] Board = new String[3][3];
		for(int num=0, i=0; i<3;i++)
		{
			for(int x=0; x<3;x++)
			{
				num++;
				Board[i][x] = "" + num;
			}
		}
		for(int e=0;e<1;e+=0)
		{
			for(int num=0, i=0; i<3;i++)
			{
				System.out.print("\n");
				for(int x=0; x<3;x++)
				{
					System.out.print(Board[i][x] + " ");
				}
			}
			for(int x=0;x<1;x+=0)
			{
				System.out.println("\nEnter the place you want your x (1-9)");
				int place = reader.nextInt()-1;
				if(place<9&&place>-1)
				{
					int xPlace = place/3;
					int yPlace = place-(xPlace*3);
					if(Board[xPlace][yPlace] != "O"&&Board[xPlace][yPlace] != "X")
					{
						Board[xPlace][yPlace] = "X";
						x++;
					}
					else
					{
						System.out.println("Invalid Input");
					}
				}
				
			}
			if((Board[0][0]=="X"&&Board[1][0]=="X"&&Board[2][0]=="X")||(Board[0][1]=="X"&&Board[1][1]=="X"&&Board[2][1]=="X")||(Board[0][2]=="X"&&Board[1][2]=="X"&&Board[2][2]=="X")||
				(Board[0][0]=="X"&&Board[0][1]=="X"&&Board[0][2]=="X")||(Board[1][0]=="X"&&Board[1][1]=="X"&&Board[1][2]=="X")||(Board[2][0]=="X"&&Board[2][1]=="X"&&Board[2][2]=="X")||
				(Board[0][0]=="X"&&Board[1][1]=="X"&&Board[2][2]=="X")||(Board[0][2]=="X")&&Board[1][1]=="X"&&Board[2][0]=="X")
				{
					System.out.println("Player won");
					break;
				}
			for(int numb=0, numUsed=0, x=0;x<=2;x++)
			{
				for(int i=0; i<=2;i++)
				{
					numb++;
					if(Board[x][i]=="X"||Board[x][i]=="O")
					{
						numUsed++;
						if(numUsed==9)
						{
							e++;
							break;
						}
					}
				}
			}
			for(int x=0;x<1;x+=0)
			{
				int columnTwoInARow = 0, rowTwoInARow=0;
				for(int z = 0; z<=2;z++)
				{
					columnTwoInARow=0;
					for(int i = 0; i<=2;i++)
					{
						if(Board[z][i]=="O")
						{
							columnTwoInARow++;
						}
						if(Board[i][z]=="O")
						{
							rowTwoInARow++;
							if(rowTwoInARow==2)
							{
								
							}
						}
					}
				}
				int computerPlace = rand.nextInt(9);
				int xPlace = computerPlace/3;
				int yPlace = computerPlace-(xPlace*3);
				if(Board[xPlace][yPlace] != "O"&&Board[xPlace][yPlace] != "X")
				{
					Board[xPlace][yPlace] = "O";
					x++;
				}
			}
			
			if((Board[0][0]=="O"&&Board[1][0]=="O"&&Board[2][0]=="O")||(Board[0][1]=="O"&&Board[1][1]=="O"&&Board[2][1]=="O")||(Board[0][2]=="O"&&Board[1][2]=="O"&&Board[2][2]=="O")||
				(Board[0][0]=="O"&&Board[0][1]=="O"&&Board[0][2]=="O")||(Board[1][0]=="O"&&Board[1][1]=="O"&&Board[1][2]=="O")||(Board[2][0]=="O"&&Board[2][1]=="O"&&Board[2][2]=="O")||
				(Board[0][0]=="O"&&Board[1][1]=="O"&&Board[2][2]=="O")||(Board[0][2]=="O")&&Board[1][1]=="O"&&Board[2][0]=="O")
			{
				System.out.println("Computer won");
				break;
			}
		}
	}
}