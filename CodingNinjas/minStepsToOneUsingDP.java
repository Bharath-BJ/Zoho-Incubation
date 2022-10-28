package CodingNinjas;

import java.util.Scanner;

public class minStepsToOneUsingDP 
{
	public static int usingRDP(int n) {
		int[] dp=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i]=-1;
        }
        return usingRDPHelper(n,dp);
	}
	private static int usingRDPHelper(int n,int[] dp)
    {
        if(n==1)
        {
            return 0;
        }
        int step1=Integer.MAX_VALUE,step2=Integer.MAX_VALUE,step3=Integer.MAX_VALUE;
        if(dp[n-1]==-1)
        {
            step1=usingRDPHelper(n-1,dp);
            dp[n-1]=step1;
        }
        else
            step1=dp[n-1];
        
        
        if(n%2==0)
        {
            if(dp[n/2]==-1)
            {
                step2=usingRDPHelper(n/2,dp);
                dp[n/2]=step2;
            }
            else
                step2=dp[n/2];
        }
        	
    
        if(n%3==0)
        {
            if(dp[n/3]==-1)
            {
                step3=usingRDPHelper(n/3,dp);
                dp[n/3]=step3;
            }
            else
                step3=dp[n/3];
        }
        	
        
        return Math.min(step1,Math.min(step2, step3))+1;
    }
	public static int usingIDP(int n)
	{ 
		if(n==1) // Edge Case
            return 0;
		int[] dp = new int[n+1];
		dp[1]=0;
		dp[2]=1;
		for(int i=3;i<dp.length;i++)
		{
			int step1=Integer.MAX_VALUE,step2=Integer.MAX_VALUE,step3=Integer.MAX_VALUE;
			step1=dp[i-1];
			if(i%2==0)
				step2=dp[i/2];
			if(i%3==0)
				step3=dp[i/3];
			dp[i]= 1 + Math.min(step1,Math.min(step2,step3));
		}
	return dp[n];
	
	
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		System.out.println(usingIDP(n));
		}

}
