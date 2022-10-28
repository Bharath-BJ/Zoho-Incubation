package Assignments1;

import java.util.*;

/*Write a program that generates a random number and asks the user to
guess that the number is. If the user's guess is higher than the random
number, the program should display "Too high, try again." If the user's guess is
lower than the random number, the program should display "Too low, try
again." The program should use a loop that repeats until the user correctly
guesses the random number*/
public class guessTheNumber {

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the input:");
		int input = s.nextInt();
		for(int i=0;true;i++)
		{
			int output = s.nextInt();
			if(output>input)
			{
				System.out.println("Too high try again");
			}
			else if(output<input)
			{
				System.out.println("Too Low try again");
			}
			else
			{
				System.out.println("Good Guess");
				break;
			}
		}
		

	}

}
