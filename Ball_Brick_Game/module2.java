package Ball_Brick_Game;

import java.util.Scanner;

public class module2 extends BallBrick 
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		module2 obj=new module2();
		char[][] game=obj.input();
		int balls=obj.ballCount();
		System.out.println("Enter the direction in which the ball need to traverse");
		System.out.println("ST for Striaght \nLD for left Diagonal \nRD for right Diagonal");
		String dir=s.next();
		do {
			switch(dir)
			{
				case "ST":
					{
						System.out.println("This is straight route");
						STTraversal(game);
						break;
					}
				case "LD":
					{
						System.out.println("This is left-diagonal route");
						LDTraversal(game);
						break;
					}
				case "RD":
				{
					System.out.println("This is right-diagonal route");
						RDTraversal(game);
						break;
				}
			}
			System.out.println("Enter the direction in which the ball need to traverse");
			System.out.println("ST for Striaght \nLD for left Diagonal \nRD for right Diagonal \nNA for Not Applicable");
			dir=s.next();
		}while(dir.equals("NA"));
		
		obj.printMatrix(game);
		System.out.println("Ball count is "+balls);

	}
	private static void STTraversal(char[][] game) {
		int m,n;
		m=n=game.length;
		int j=n/2;
		for(int i=n-1;i>=0;i--)
		{
			if(game[i][j]=='1')
			{
				game[i][j]='\0';
				break;
			}
		}
		
	}
	private static void LDTraversal(char[][] game) {
		int m,n;
		m=n=game.length;
		int i=n-1,j=n/2;
		while(game[i][j]!='W')
		{
			
			i--;
			j--;
		}
//		System.out.println(i);
		// That row brick will destroyed as ball moves horizontal after it hits the wall
		int row=i;
		int col;
		for(col=0;game[row][col]!='1';col++)
		{
		}
		game[row][col]='\0';
	}
	private static void RDTraversal(char[][] game) 
	{
		int m,n;
		m=n=game.length;
		int i=n-1,j=n/2;
		while(game[i][j]!='W')
		{
			
			i--;
			j++;
		}
//		System.out.println(i);
		// That row brick will destroyed as ball moves horizontal after it hits the wall
		int row=i;
		int col;
		for(col=n-1;game[row][col]!='1';col--)
		{
			//Nothing to do till brick is reached i.e '1'
		}
		game[row][col]='\0';
		
	}

	

	

}
