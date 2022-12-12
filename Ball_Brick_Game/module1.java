package Ball_Brick_Game;
import java.util.*;
public class module1 extends BallBrick 
{
	public static void main(String[] args) 
	{
		module1 obj=new module1();
		char[][] game=obj.input();
		int balls=obj.ballCount();
		obj.printMatrix(game);
		System.out.println("Ball count is "+balls);
	}
}
