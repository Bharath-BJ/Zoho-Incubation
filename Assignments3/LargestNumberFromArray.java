package Assignments3;

import java.util.Scanner;

public class LargestNumberFromArray 
{
	private static String rearrange(String arr[])
	 {
		int n=arr.length;
		String str="";
		for(int i=0;i<n;i++)  // for every iteration digit of largest number is arranged
		{
			for(int j=i+1;j<n;j++) 
			{
				String ij=arr[i]+arr[j];
				String ji=arr[j]+arr[i];
				if(Integer.parseInt(ij)<Integer.parseInt(ji)) 
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
			str+=arr[i];
			}
		return str;
	}
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no of elements:");
		int n=s.nextInt();
		System.out.println("Enter the elements");
		String[] arr=new String[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=Integer.toString(s.nextInt());
		}
		String str=rearrange(arr);
		System.out.println(str);
	}
}
