package Assignments1;

import java.util.*;

/*Given two strings a and b. The task is to find if the string 'b' can be obtained
by rotating another string 'a' by exactly 2 places.
Example 1:
Input:
a = amazon
b = azonam
Output: 1
Example 2:  Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 0                           */
public class isSameAfterRotation 
{
	private static void rotateArray(char[] arr,int si,int ei)
	{
		while(si<=ei)
		{
			char temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;
			si++;
			ei--;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter a string1:");
		String str1 = s.next();
		System.out.println("Enter a string2:");
		String str2 = s.next();
		int rotation = 2;
		if(str1.length()!=str2.length())    // Checking whether both strings of same length
		{
			System.out.println(false);
			return;
		}
		
		char[] arr = str1.toCharArray(); 
		str1="";
		rotateArray(arr,0,rotation-1);
		rotateArray(arr,rotation,arr.length-1);
		rotateArray(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++)  // Comparing the str1 and str2
		{
			if(arr[i]!=str2.charAt(i))
			{
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}
	

}
