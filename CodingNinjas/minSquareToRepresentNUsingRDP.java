package CodingNinjas;

import java.util.Scanner;

public class minSquareToRepresentNUsingRDP 
{
	public static int minCount(int n) 
	{
		int[] dp = new int[n+1];
		for(int i=0;i<n+1;i++)
			dp[i]=-1;
		return helper(n,dp);
	}
	private static int helper(int n,int[] dp)
	{
		if(n==0)
			return 0;
		int minAns = Integer.MAX_VALUE;
		
		for(int i=1;i*i<=n;i++)
		{
			int currAns;
			if(dp[n-i*i]==-1)
			{
				currAns= helper(n-i*i,dp);
				dp[n-i*i]=currAns;
			}
			else
				currAns = dp[n-i*i];
			
			if(currAns<minAns)
				minAns=currAns;
		}
		int ans = minAns+1;
	return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(minCount(n));
		
	}
}
