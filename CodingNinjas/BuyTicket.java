package CodingNinjas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BuyTicket {
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
	public static int buyTicket(int input[], int k) 
	{
		int n=input.length;
		Queue<Integer> q = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++)
		{
			pq.add(input[i]);
			q.add(i);
		}
//		while(!pq.isEmpty())
//		{
//			System.out.print(pq.poll()+" ");
//		}
//		while(!q.isEmpty())
//		{
//			System.out.print(q.poll()+" ");
//		}
		
		int time=0;
		while(true)
		{
			if(input[q.peek()]==pq.peek() && k==0)
			{
				time++;
				q.poll();
				pq.poll();
				k=(k==0)? n-1 : k-- ;
				break;
			}
			else if(input[q.peek()]==pq.peek())
			{
				time++;
				q.poll();
				pq.poll();
				k=(k==0)? n-1 : k-- ;
			}
//			if(input[q.peek()]<pq.peek())
			else
			{
				q.poll();
				q.add(input[q.peek()]);
				k=(k==0)? n-1 : k-- ;
				
			}
		}
		
	return time;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] input = takeInput();
		System.out.println("Enter the index of your priority");
		int k=s.nextInt();
		System.out.println(buyTicket(input,k));
		
	}

}
