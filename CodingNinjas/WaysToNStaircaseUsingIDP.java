package CodingNinjas;

import java.util.Scanner;

public class WaysToNStaircaseUsingIDP {
	private static long staircase(int n) {
		long[] ways = new long[n+1];
		if(n==0)
			return 1;
		if(n==1 || n==2)
			return n;
		ways[0]=1;
		ways[1]=1;
		ways[2]=2;
		for(int i=3;i<ways.length;i++)
		{
			ways[i]=ways[i-1]+ways[i-2]+ways[i-3];
		}
	return ways[n];
	}
	 public static void main(String[] args)
	    {
	    	Scanner s = new Scanner(System.in);
	    	int n =s.nextInt();
	    	System.out.println(staircase(n));
	    }

	
	

}
