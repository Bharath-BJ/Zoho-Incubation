package Assignments4;

import java.util.Scanner;

public class CountVowelsInString {
	private static int countVowels(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='e'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count++;
			}
		}
	return count;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(countVowels(str));

	}

}
