package Assignments1;

import java.util.*;
// Write a Java program to add two binary numbers.
/*  0 + 0 = 0
	0 + 1 = 1
	1 + 0 = 1
	1 + 1 =10
	 
	      1 1 1
      1 0 1 1 1
(+) 1 1 0 0 0 1
 ———————–———————–
  1 0 0 1 0 0 0                                
 ———————–———————–	                                             */                                        
public class binaryAddition {
	public static boolean checkBinary(int b)
	{
		while(b>0)
		{
			if(b%10!=0 ||b%10!=1) 
			{
//				System.out.println(b);
				return false;
			}
			b=b/10;
		}
	return true;
	}
	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the first binary number");
		int b1=s.nextInt();
		while(!checkBinary(b1))  // Check whether entered number is binary or not
		{
			System.out.println("Please enter a binary number");
			b1=s.nextInt();
		}
		System.out.println("Enter the second binary number");
		int b2=s.nextInt();
		while(!checkBinary(b2))  // Check whether entered number is binary or not
		{
			System.out.println("Please enter a binary number");
			b2=s.nextInt();
		}
		int sum[]=new int[32],i=0;
		int rem=0;
		while(b1!=0 || b2!=0)
		{
			sum[i] = (b1%10+b2%10+rem)%2;
			rem= (b1%10+b2%10+rem)/2;
			b1/=10;
			b2/=10;
			i++;
		}
		if(rem!=0)   // If remainder exists after all common addition, appended in the array as it is
		{
			sum[i]=rem;
		}
		for(int j=sum.length-1;j>=0;j--)  // Print reverse for the binary after addition
		{
			System.out.print(sum[j]+" ");
		}
	}

}
