package CodingNinjas;

import java.util.Scanner;

public class printSubsequencesRecur {
	public static void printSubseq(String str,String stringSoFar)
	{
		if(str.length()==0)
		{
			System.out.println(stringSoFar);
			return;
		}
		printSubseq(str.substring(1),stringSoFar);
		printSubseq(str.substring(1),stringSoFar+str.charAt(0));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		printSubseq(str,"");
	}

}
