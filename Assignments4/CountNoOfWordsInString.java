package Assignments4;
import java.util.Scanner;

public class CountNoOfWordsInString {
	private static int countWords(String str)
	{
		int count=0;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i-1)>=97 && str.charAt(i-1)<=122)
			{
				count++;
			}
		}
	return count+1;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(countWords(str));

	}

}
