package Assignments3;
import java.util.*;
/*4) Given a list of non-negative integers nums, arrange them such that they form the largest number
	and return it. Since the result may be very large, so you need to return a string instead of an
	integer.
	Input: nums = [10,2]
	Output: "210"
	Input: nums = [3,30,34,5,9]
	Output: "9534330"        */
public class formLargestNumberFromArray 
{
	private static void sort(int[] arr,int si, int ei,boolean mostSig)
	{
		for(int i=si;i<ei;i++)
		{
			for(int j=si;j<=ei-1-i;j++)
			{
				int value1=0;
				int value2=0;
				if(mostSig)
				{
					int digits1 = digits(arr[j]);
					int digits2 = digits(arr[j+1]);
					value1=reduction(arr[j],digits1,mostSig);
//					System.out.print(value1+" "+i+" "+j+" and ");
					value2=reduction(arr[j+1],digits2,mostSig);
//					System.out.println(value2+" "+i+" "+j);
				}
				else
				{
					int digits1 = digits(arr[j]);
					int digits2 = digits(arr[j+1]);
					value1=reduction(arr[j],digits1,mostSig);
					value2=reduction(arr[j+1],digits2,mostSig);
					while(value1==value2)
					{
						reduction(arr[j]%digits1-1,digits1,mostSig);
						reduction(arr[j+1]%digits2-1,digits2,mostSig);
					}
				}
				if(value1>value2)
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	private static int digits(int num)
	{
		int digits=0;
		while(num!=0)
		{
			digits++;
			num/=10;
		}
	return digits;
	}
	private static int reduction(int elem,int digits,boolean mostSig)
	{
		if(mostSig)
		{
			return elem;
		}
		elem=(int)(elem/Math.pow(10, digits-2));
	return elem%10;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[] nums= {3,30,34,5,9};
		int n=nums.length-1;
		sort(nums,0,n,false);
//		for(int i=0;i<n-1;i++)
//		{
//			if(nums[i]==nums[i+1])
//			{
//				int digits1=digits(nums[i]);
//				int digits2=digits(nums[i+1]);
//				while(reduction(nums[i],digits1,false)==reduction(nums[i+1],digits2,false))
//				{
//					reduction(nums[i]%digits1-1,digits1,false);
//					reduction(nums[i]%digits2-1,digits2,false);
//				}
//				sort(nums,i,i+1,false);
//			}
//		}
		System.out.println(Arrays.toString(nums));
//		String str="";
//		
//		System.out.println(str);

	}

}
