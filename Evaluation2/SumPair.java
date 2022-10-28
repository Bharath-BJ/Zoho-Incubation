package Evaluation2;

import java.util.Scanner;

public class SumPair {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter the sum");
		int sum=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum || arr[i]+arr[j]==-sum)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
		
		
	}

}
