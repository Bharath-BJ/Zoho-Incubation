package Assignments4;
import java.util.Scanner;

public class TwinPrime {
	private static boolean checkPrime(int n)
	{
		for(int j=2;j<=n/2;j++)
		{
			if(n%j==0)
			{
				return false;
			}
		}
	return true;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=100;
		for(int i=2;i<n;i++)
		{
			if(checkPrime(i) && checkPrime(i+2))
			{
				System.out.println(i+" "+(i+2)+" ");
			}
		}
	}

}
