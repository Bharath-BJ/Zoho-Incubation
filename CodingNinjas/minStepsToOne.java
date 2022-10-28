package CodingNinjas;
import java.util.*;
public class minStepsToOne {
	public static int countMinStepsToOne(int n) 
	// Here greedy approach(first n/3 then n/2 then n-1) will not work for few inputs Eg: 10,20,82 
	{
		if(n==1)
        {
            return 0;
        }
        int step1=Integer.MAX_VALUE,step2=Integer.MAX_VALUE,step3=Integer.MAX_VALUE;
        step1=countMinStepsToOne(n-1);
        if(n%2==0)
        	step2=countMinStepsToOne(n/2);
        if(n%3==0)
        	step1=countMinStepsToOne(n/3);
        
        return Math.min(step1,Math.min(step2, step3))+1;
        
        
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n =s.nextInt();
	System.out.println(countMinStepsToOne(n));
	}

}
