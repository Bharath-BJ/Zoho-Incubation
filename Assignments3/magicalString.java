package Assignments3;
import java.util.*;

/*3) A magical string s consists of only '1' and '2' and obeys the following rules:
	● The string s is magical because concatenating the number of contiguous occurrences of
	characters '1' and '2' generates the string s itself.
	The first few elements of s is s = "1221121221221121122……". If we group the consecutive 1's
	and 2's in s, it will be "1 22 11 2 1 22 1 22 11 2 11 22 ......" and the occurrences of
	1's or 2's in each group are "1 2 2 1 1 2 1 2 2 1 2 2 ......". You can see that the
	occurrence sequence is s itself.
	Given an integer n, return the number of 1's in the first n number in the magical string s.
	Input: n = 6
	Output: 3
	Explanation: The first 6 elements of magical string s is "122112" and it
	contains three 1's, so return 3.
	Input: n = 1
	Output: 1                                   */
public class magicalString {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		if(n<3)
		{
			System.out.println(1);
			return;
		}
		arr[0]=1;
		arr[1]=arr[2]=2;
		int FI=2,RMI=2;       // FI-->Freq index   RMI--> Rightmost element index
		while(RMI<n)
		{
			int i=1;
			while(i<=arr[FI] && RMI+i<n)   // 1st condition is for freq iteration & 2nd condition is for to restrict the sequence based on the arr.length
			{
			arr[RMI+i]=arr[RMI]^3;
//			System.out.println("Printed "+arr[RMI+i]);
			i++;
			}
			RMI=RMI+arr[FI];
			FI++;
//			System.out.println("RMI "+RMI);
//			System.out.println("FI "+FI);
		}
		
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==1)
			{
				count++;
			}
		}
		System.out.println(count);
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
	}

}
