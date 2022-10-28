package CodingNinjas;

import java.util.Scanner;

public class printMinInArrayRecur {
	public static int printMin1(int[] arr,int si)
	{
		if(si==arr.length-1)
		{
			return Integer.MAX_VALUE;
		}
		int smallOutput=printMin1(arr,si+1);
		if(arr[si]<smallOutput)
			return arr[si];
		else
			return smallOutput;
	}
	public static void printMin2(int[] arr,int si,int MinSoFar)
	{
		if(si==arr.length-1)
		{
			System.out.println(MinSoFar);
			return;
		}
		MinSoFar=(arr[si]<MinSoFar)? arr[si] : MinSoFar ;
		printMin2(arr,si+1,MinSoFar);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		printMin2(arr,0,Integer.MAX_VALUE);
		System.out.println(printMin1(arr,0));
	}

}
