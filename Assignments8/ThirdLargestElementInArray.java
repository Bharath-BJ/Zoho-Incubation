package Assignments8;

import java.util.Scanner;

public class ThirdLargestElementInArray {

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
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		int thirdLargest=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>largest)
			{
				thirdLargest=secondLargest;
				secondLargest=largest;
				largest=arr[i];
			}
			if(arr[i]<largest && arr[i]>secondLargest)
			{
				thirdLargest=secondLargest;
				secondLargest=arr[i];
			}
			if(arr[i]<largest && arr[i]<secondLargest && arr[i]>thirdLargest)
			{
				thirdLargest=arr[i];
			}
		}
		System.out.println("Third Largest element in an array is "+thirdLargest);
	}

}
