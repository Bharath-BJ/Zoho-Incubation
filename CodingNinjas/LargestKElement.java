package CodingNinjas;

import java.util.*;

public class LargestKElement {
	private static int[] takeInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
	return arr;
	}
	public static ArrayList<Integer> kLargest(int input[], int k) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			pq.add(input[i]);
		}
		for(int i=k;i<input.length;i++)
		{
			if(pq.peek()<input[i])
			{
				pq.poll();
				pq.add(input[i]);
			}
		}
		ArrayList<Integer> output = new ArrayList<>();
		while(!pq.isEmpty())
		{
			output.add(pq.poll());
		}
	return output;
	}
//	private static void downHeapify(int[] input,int i,int n)
//	{
//		int parentIndex = i;
//		int leftChildIndex=2*parentIndex-1;
//		int rightChildIndex=2*parentIndex-2;
//		while(leftChildIndex<n)
//		{
//			int minIndex=parentIndex;
//			if(input[leftChildIndex]<input[minIndex])
//			{
//				minIndex=leftChildIndex;
//			}
//			if(rightChildIndex<n && input[rightChildIndex]<input[minIndex])
//			{
//				minIndex=rightChildIndex;
//			}
//			if(minIndex==parentIndex)
//			{
//				return;
//			}
//			int temp = input[parentIndex];
//			input[parentIndex] = input[minIndex];
//			input[minIndex] = temp;
//			
//			parentIndex=minIndex;
//			leftChildIndex=2*parentIndex-1;
//			rightChildIndex=2*parentIndex-2;
//		}
//	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[] input = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		int k = 4;
		ArrayList<Integer> output = kLargest(input,k);
		System.out.println(output);
	}

}
