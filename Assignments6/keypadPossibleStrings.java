package Assignments6;
import java.util.*;
public class keypadPossibleStrings {
	public static String[] keypad(int given)
	{
		
		if(given==0)
		{
			String[] output = new String[1];
			output[0]="";
			return output;
		}
		String[] smallOutput=keypad(given/10);
		String lastDigitString = numKey(given%10);
		String[] output = new String[smallOutput.length*lastDigitString.length()];
		int k=0;
		for(int i=0;i<smallOutput.length;i++)
		{
			String s = smallOutput[i];
			for(int j=0;j<lastDigitString.length();j++)
			{
				char c = lastDigitString.charAt(j);
				output[k++]=s+c;
			}
		}
		return output;
	}
	private static String numKey(int n)
	{
		if(n==2)
			return "abc";
		if(n==3)
			return "def";
		if(n==4)
			return "ghi";
		if(n==5)
			return "jkl";
		if(n==6)
			return "mno";
		if(n==7)
			return "pqrs";
		if(n==8)
			return "tuv";
		if(n==9)
			return "wxyz";
	return "";
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String stri=s.next();
		int given=Integer.parseInt(stri);
		String[] output=keypad(given);
		for(String i:output)
		{
			System.out.println(i);
		}
	}

}
