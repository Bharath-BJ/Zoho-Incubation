package Assignments7;
import java.util.*;
public class RectangleArea extends Rectangle {

	static Scanner s= new Scanner(System.in);
	public RectangleArea(int length,int breadth)
	{
		super(length,breadth);
	}
	public static RectangleArea read_input()
	{
		int length = s.nextInt();
		int breadth = s.nextInt();
		RectangleArea r=new RectangleArea(length,breadth);
	return r;
	}
	void display()
	{
		int area=this.length*this.breadth;
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		RectangleArea r =RectangleArea.read_input();
		r.display();
		
		
	}
	
		
}


