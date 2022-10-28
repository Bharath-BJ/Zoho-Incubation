package CodingNinjas;

import java.util.Scanner;

public class WaysToNStaircaseUsingRDP {
	public static long staircase(int n) {
		long[] dp=new long[n+1];
        return staircase(n,dp);
	}
    private static long staircase(int n,long[] dp)
    {
    	if(n==0) // Base case
        	return 1;
        if(n<0) 
            return 0;
        
        long n1=0,n2=0,n3=0;
       	if(n-1>=0) // Checking the index within the range
        {
             if(dp[n-1]==0) // Check already sub-structure is found
            {
                n1=staircase(n-1,dp);
                dp[n-1]=n1;
            }
            else
                n1=dp[n-1];
        }
		if(n-2>=0) // Checking the index within the range
        {
            if(dp[n-2]==0) // Check already sub-structure is found
            {
                n2=staircase(n-2,dp);
                dp[n-2]=n2;
            }
            else
                n2=dp[n-2];
        }
		if(n-3>=0) // Checking the index within the range
        {
            if(dp[n-3]==0) // Check already sub-structure is found
	        {
	            n3=staircase(n-3,dp);
	        	dp[n-3]=n3;
	        }
	        else
	            n3=dp[n-3];
        }
        return n1+n2+n3;
    }
    public static void main(String[] args)
    {
    	Scanner s = new Scanner(System.in);
    	int n =s.nextInt();
    	System.out.println(staircase(n));
    }
}
