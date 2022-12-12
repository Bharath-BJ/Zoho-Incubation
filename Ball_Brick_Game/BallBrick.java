package Ball_Brick_Game;
import java.util.*;
public class BallBrick {
	static Scanner s = new Scanner(System.in);
	void printMatrix(char[][] game)
	{
		// Printing the Matrix
		int m,n;
		m=n=game.length;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(game[i][j]+" ");
			}
			System.out.println();
		}
	}
	char[][] input(){
//		System.out.println("Enter the size the Matrix:");
		int m,n;
		int dimension=s.nextInt();
		while(dimension%2==0)
		{
			System.out.println("Enter a odd dimentional matrix");
			dimension=s.nextInt();
		}
		m=n=dimension;
		char[][] game=new char[m][n];
		// Initializing the default values
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==0 || j==n-1)
				{
					game[i][j]='W';
					continue;
				}
				if(i==n-1 && j==m/2)
				{
					game[i][j]='o';
					continue;
				}
				if(i==n-1 && game[i][j]=='\0')
					game[i][j]='G';
			}
		}
		char proceed;
		do
		{
//			System.out.println("Enter the brick position and the brick type :");
			int i=s.nextInt();
			int j=s.nextInt();
			char c=s.next().charAt(0);
			game[i][j]=c;
//			System.out.println("Do you want to continue(Y or N)?");
			proceed=s.next().charAt(0);
		}while(proceed=='Y');
	return game;
	}
	int ballCount()
	{
		System.out.println("Enter the ball Count :");
		int balls=s.nextInt();
	return balls;
	}

}
