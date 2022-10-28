
package Assignments2;
import java.util.*;

/*1. Given a String with or without special characters find if it is Palindrome or Not.. No splitting of
	array must be done or No additional spaces must be used for storing the array..
	Eg: RACE CAR
	Eg: I DID, DID I ?          */
public class checkPalindrome {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the String input");
		String str = s.nextLine();
		int si=0,ei=str.length()-1;
		while(si<ei)
		{
			if(!(str.charAt(si)>='a' && str.charAt(si)<='z' || str.charAt(si)>='A' && str.charAt(si)<='Z'))
			{
				si++;
				continue;
			}
			if(!(str.charAt(ei)>='a' && str.charAt(ei)<='z' || str.charAt(ei)>='A' && str.charAt(ei)<='Z'))
			{
				ei--;
				continue;
			}
			if(str.charAt(si)!=str.charAt(ei))
			{
				System.out.println("Given string is not Palindrome");
				return;
			}
			si++;
			ei--;
		}
	System.out.println("Given string is Palindrome");
	}

}
