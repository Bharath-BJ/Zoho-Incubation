package Assignments8;

import java.util.Scanner;

public class WaveLikeArray 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = s.nextInt();
		int arr[] = new int[n];
		// Taking the input from user
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element at index "+i);
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n-1;i+=2)
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(int i:arr)
			System.out.print(i+" ");
	}

}
