package CodingNinjas;
import java.util.*;
public class minSquareToRepresentN {
	public static int minCount(int n) 
	{
		if(n==0)
			return 0;
		int ans = Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++)
		{
			ans= Math.min(minCount(n-i*i),ans);		
		}
	return ans+1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(minCount(n));
		
	}

}
