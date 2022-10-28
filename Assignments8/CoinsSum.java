package Assignments8;

public class CoinsSum {

	public static int noOfWays(int[] coins,int sum)
	{
		if(sum==1)
		{
			return 1;
		}
		if(sum<=0)
		{
			return 0;
		}
		int possibility = 0;
		for(int i=0;i<coins.length;i++)
		{
			int curr;
			if(sum-coins[i]==0)
				curr=noOfWays(coins,sum-coins[i])+1;
			else
				curr=noOfWays(coins,sum-coins[i]);
			possibility+=curr;
		}
	return possibility;
	}
	public static void main(String[] args) {
//		int coins[]= {2,5,3,6};
		int coins[]= {1,2,3};
		int sum=3;
		System.out.println(noOfWays(coins,sum));
	}

}
