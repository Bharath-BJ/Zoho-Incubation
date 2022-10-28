package Assignments1;

import java.util.*;

/*Given a string check if it is Pangram or not. A pangram is a sentence
containing every letter in the English Alphabet.
Example 1:
Input:
S = Bawds jog, flick quartz, vex nymph
Output: 1
Example 2:
Input:
S = sdfs
Output: 0              */
public class isPangram {

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		String str =s.nextLine();
		int arr[]=new int [26];      // Using the boolean array concept
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>=65 && c<=90)
			{
				arr[c-65]=1;
			}
			if(c>=97 && c<=122)
			{
				arr[c-97]=1;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println("String is not a pangram");
				return;
			}
		}
		System.out.println("String is pangram");
	}

}
