package OOPSPractice;

// Example for Tightly Encapsulated Class
public class Rectangle {
	int length;
	int breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void setLength(int length)
	{
		if(length<0)
			return;
		this.length=length;
	}
	public int getLength()
	{
		return length;
	}
	public void setBreadth(int breadth)
	{
		this.breadth=breadth;
	}
	public int getBreadth()
	{
		return breadth;
	}
	protected void finalize() throws Throwable
	{
		System.out.println("Object is destroyed");
	}
}
