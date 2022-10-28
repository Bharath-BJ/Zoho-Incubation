package Evaluation1;

import java.util.Scanner;

public class subArraySum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the size of an array ");
		int n = 11;
		int[] arr = {0,5,-7,1,-4,7,6,1,4,1,10};
		int target=-3;
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println("Enter the element at "+i+" index");
//			arr[i]=s.nextInt();
//		}
		int i=0;
		ol:
		while(i<arr.length)
		{
			int sum=arr[i];
			il:
			for(int j=i+1;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum==target)
				{
//					System.out.print("{");
					for(int k=i;k<=j;k++)
					{
						System.out.print(arr[k]+" ");
					}
//					System.out.print("}");
					i++;
					break ol;   // To get all possible sub-array we can break just inner loop 
				}
				if(sum>target)
				{
					i++;
					break il;
				}
			}
		}
		System.out.println();
		
	}

}
