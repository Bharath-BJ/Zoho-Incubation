package Assignments2;

import java.util.*;

/*3. A number is said to be twisted prime if it is a prime number and reverse of the number is also a
	prime number.
	Input : 97 Output : Twisted Prime Number
	Explanation: 97 is a prime number and its reverse 79 is also a prime
	number.            */
public class twistedPrime 
{
	private static boolean isPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				return false;
			}
		}
	return true;
	}
	private static int reverseNumber(int num)
	{
		int reverse=0;	
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		return reverse;
	}
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input");
		int num=s.nextInt();
		int temp=reverseNumber(num);
		if(isPrime(num) && isPrime(temp))
		{
			System.out.println("Given number is Twisted Prime");
		}
		else
		{
			System.out.println("Given number is Not Twisted Prime");
		}
		
	}

}
