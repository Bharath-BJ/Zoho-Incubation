package Evaluation2;

import java.util.Scanner;

public class MaxTripletProduct {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]*arr[j]*arr[k]>max)
					{
						max=arr[i]*arr[j]*arr[k];
					}
				}
			}
		}
		System.out.println(max);
	}

}
