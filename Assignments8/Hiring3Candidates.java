package Assignments8;

import java.util.Arrays;
import java.util.Scanner;

public class Hiring3Candidates 
{
	public static int bestApproach(int[] arr)
	{
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		int thirdLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			// If element larger than Largest all three values are revised
			if(arr[i]>largest) 
			{
				thirdLargest=secondLargest;
				secondLargest=largest;
				largest=arr[i];
			}
			// If element larger than SecondLargest, both second largest and third largest values are revised
			if(arr[i]<largest && arr[i]>secondLargest)
			{
				thirdLargest=secondLargest;
				secondLargest=arr[i];
			}
			// If element larger than ThirdLargest, only thirdLaregst value is revised
			if(arr[i]<largest && arr[i]<secondLargest && arr[i]>thirdLargest)
			{
				thirdLargest=arr[i];
			}
		}
//		System.out.println(thirdLargest+" "+secondLargest+" "+largest);
	return thirdLargest*secondLargest*largest;
	}
	public static int naiveApproach(int[] arr) 
	{
		int n=arr.length;
		Arrays.sort(arr);
		if(arr[0]<0 && arr[1]<0 && arr[n-1]>0)
		{
			return arr[0]*arr[1]*arr[n-1];
		}
		else
		{
			return arr[n-1]*arr[n-2]*arr[n-3];
		}
	}
	public static void main(String[] args) {
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
//		System.out.println(bestApproach(arr));
		System.out.println(naiveApproach(arr));
		
	}

}
