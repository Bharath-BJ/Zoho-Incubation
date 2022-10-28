package Assignments1;

import java.util.*;
//   Write a Java program to solve quadratic equations (use if, else if and else).
public class solveQuadraticEqn {
	private static double sqrtRoot(double num)   
	{  
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		return sqrtroot;  
	}  
	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		int a = s.nextInt(),b=s.nextInt(),c=s.nextInt();
		System.out.println("Given quadratic equation is "+a+"x^2+"+b+"x+"+c);
		double factor = 1.0*b*b-(4*a*c);
		double rootFactor = factor<0?sqrtRoot(-factor):sqrtRoot(factor);
		if(factor>0)
		{
			double root1 = (-b + rootFactor)/2*a;
			double root2 = (-b - rootFactor)/2*a;
			System.out.println("It has real and distinct roots: "+root1+","+root2);
		}
		else if(factor<0)
		{
			double realPart = -b*1.0/2*a;
			double imaPart1 = rootFactor/2*a;
			double imaPart2 = rootFactor/2*a;
			System.out.println("It has real and imaaginary roots : "+realPart+"+i"+imaPart1+","+realPart+"+i"+imaPart2);
		}
		else
		{
			double root = -b*1.0/2*a;
			System.out.println("It has real and same roots : "+root);
		}
	}

}
