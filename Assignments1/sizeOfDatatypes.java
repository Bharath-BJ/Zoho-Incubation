package Assignments1;
import java.util.*;
public class sizeOfDatatypes {
//      Write a Java program that takes a number as input and prints its
//    	multiplication table up to 10
	public static void main(String[] args) 
	{
		System.out.println("Size of all data types and it's range");
		System.out.println("byte: size " + (Byte.SIZE/8) + " bytes and it's ranges from "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
	    System.out.println("short: size " + (Short.SIZE/8) + " bytes and it's ranges from "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
	    System.out.println("int: size " + (Integer.SIZE/8) + " bytes and it's ranges from "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
	    System.out.println("long: size " + (Long.SIZE/8) + " bytes and it's ranges from "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
	    System.out.println("char: size " + (Character.SIZE/8) + " bytes");
	    System.out.println("float: size " + (Float.SIZE/8) + " bytes and it's ranges from "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
	    System.out.println("double: size " + (Double.SIZE/8) + " bytes and it's ranges from "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);

	}

}
