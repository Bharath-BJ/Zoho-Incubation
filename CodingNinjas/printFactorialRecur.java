package CodingNinjas;

import java.util.Scanner;

public class printFactorialRecur {
	public static int fact(int n,int answer)
	{
		if(n==0)
		{
			System.out.println(answer);
			return 1;
		}
		answer=n*answer;
		return fact(n-1,answer);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		fact(n,1);
	}
}
