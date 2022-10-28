package Assignments6;
import java.util.*;
public class sumClosestToTarget {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		int closest=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(Math.abs(arr[i]+arr[j]+arr[k]-target)<closest)
					{
						closest=Math.abs(sum-target);
						sum=arr[i]+arr[j]+arr[k];
					}
				}
			}
		}
		System.out.println(sum);
	}

}
