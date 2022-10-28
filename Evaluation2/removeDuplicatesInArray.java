package Evaluation2;

import java.util.Scanner;

public class removeDuplicatesInArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=Integer.MIN_VALUE;
				}
			}
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==Integer.MIN_VALUE)
				count++;
		}
		int[] temp=new int[arr.length-count];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
				temp[k++]=arr[i];
		}
		for(int j=0;j<temp.length;j++)
		{
			System.out.print(temp[j]+" ");
		}
		System.out.println(count);
	}

}
