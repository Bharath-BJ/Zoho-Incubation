package Evaluation2;
import java.util.*;
public class DisplaySuceedingNumberAsArray {
	public static void displayNextNumber(int[] arr,int si,int ei)
	{
		int n=arr.length;
		if(arr[n-1]<9)
		{
			arr[ei]++;
			return;
		}
		if(si>ei) //base case
			return;
		if(si==ei && arr[ei]==9)
		{
			int[] temp =new int[n+1];
			for(int i=0;i<n;i++)
			{
				temp[i+1]=arr[i];
			}
			arr=temp;
			return;
		}
		if(arr[ei]==9)
		{
			arr[ei]=0;
			arr[ei-1]++;
		}
		displayNextNumber(arr,si,ei-1);
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		String str="";
		for(int i=0;i<n;i++)
		{
			str+=arr[i];
		}
		int num=Integer.parseInt(str);
		num++;
		int index=n-1;
		while(num>0)
		{
			if(index==-1)
			{
				int[] temp=new int[n+1];
				for(int i=n-1;i>=0;i--)
				{
					temp[i]=arr[i];
				}
				temp[0]=1;
				arr=temp;
				break;
			}
			arr[index--]=num%10;
			num/=10;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
