package Assignments4;
import java.util.*;
public class SmallestofThreeNumbers 
{
	private static int smallest(int n1,int n2,int n3)
	{
		int min=n1;
		if(n2<min)
		{
			min=n2;
		}
		if(n3<min)
		{
			min=n3;
		}
	return min;
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n1=s.nextInt(), n2=s.nextInt(), n3=s.nextInt();
		System.out.println(smallest(n1,n2,n3));
	}

}
