package CodingNinjas;

import java.util.Scanner;

public class minSquareToRepresentNUsingIDP {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] dp = new int[n+1];
		dp[0]=0;  // As from the base case of RDP if n==0,return 0;
		for(int i=1;i<dp.length;i++)
		{
			int minAns=Integer.MAX_VALUE;
			for(int j=1;j*j<=i;j++)  // Similiar to the path exploration in RDP
			{
				int currAns=dp[i-(j*j)];
				if(currAns<minAns)  // Revise the minSquares when curr is lesser 
					minAns=currAns;
			}
			dp[i]=minAns+1; 
		}
		
		System.out.println(dp[n]);
		
	}
}
