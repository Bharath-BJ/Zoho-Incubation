package Assignments2;

import java.util.*;

/*10. Given a string, change the order of words in the string (last string should come first).
	Should use RECURSION
	Sample: one two three
	Output : three two one                */
public class reverseWordsInString 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str = s.nextLine();
		System.out.println(reverseWordsRecursive(str,0,str.length()-1));

	}
	private static String reverseWordsRecursive(String str,int si,int ei)
	{
		if(si>=ei)
		{
			return null;
		}
		String word="";
		int wordStart=0;
		int i,j;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				int wordEnd=i-1;
				word="";
				for(j=wordStart;j<=wordEnd;j++)
				{
					word+=str.charAt(j);
				}
				break;
			}
		}
		wordStart=i+1;
		if(word.isEmpty())
		{
			return str;
		}
	return reverseWordsRecursive(str.substring(wordStart,str.length()),wordStart,str.length())+" "+word;
	}
	private static String reverseWordsIterative(String str)
	{
		String output="";
		int wordStart=0;
		int i=0,j=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				int wordEnd=i-1;
				String word="";
				for(j=wordStart;j<=wordEnd;j++)
				{
					word+=str.charAt(j);
				}
				wordStart=i+1;
				output=word+" "+output;
			}
		}
		int wordEnd=i-1;
		String word="";
		for(j=wordStart;j<=wordEnd;j++)
		{
			word+=str.charAt(j);
		}
		wordStart=i+1;
		output=word+" "+output;
		System.out.println(output);
	return output;
	}
}
