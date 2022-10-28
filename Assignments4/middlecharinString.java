package Assignments4;

import java.util.Scanner;

public class middlecharinString {
	private static void middleChar(String str)
	{
		int n=str.length();
		if(n%2==1)
		{
			System.out.println(str.charAt(n/2));
			return;
		}
		System.out.print(str.charAt(n/2-1)+" "+str.charAt(n/2)  );
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		middleChar(str);

	}

}
