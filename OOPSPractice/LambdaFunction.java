package OOPSPractice;
 
class Hi implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(1000);} catch (Exception e ) {}
		}
	}
}
class Hello implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(1000);} catch (Exception e ) {}
		}
	}
}
public class LambdaFunction extends Thread {
	public static void main(String[] args) {  
	    Runnable hi = new Hi();
	    Runnable hello = new Hello();
	    Thread obj1 =new Thread(hi);
	    Thread obj2 =new Thread(hello);
	    obj1.start();
	    try{Thread.sleep(10);} catch (Exception e ) {}
	    obj2.start();
//	    obj1.show();
//	    obj2.show();
	}  
	  
}