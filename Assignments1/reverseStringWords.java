package Assignments1;

import java.util.*;

/*Given a String S, reverse the string without reversing its individual words.
Words are separated by dots.
Example 1:
Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Example 2:
Input:
S = pqr.mno
Output: mno.pqr                            */
public class reverseStringWords {
	private static void reverseArray(char[] arr,int si,int ei)
	{
		while(si<ei)
		{
			char temp=arr[si];
			arr[si]=arr[ei];
			arr[ei]=temp;
			si++;
			ei--;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the string:");
		String str = s.nextLine();
		char[] arr = str.toCharArray();
		str="";
		int si=0,ei=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='.')
			{
				ei=i-1;
				reverseArray(arr,si,ei);
				si=i+1;
			}	
		}
		ei=arr.length-1;
		reverseArray(arr,si,ei);
		
		reverseArray(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++)
		{
			str+=arr[i];
		}
		System.out.println(str);
		
	}

}
