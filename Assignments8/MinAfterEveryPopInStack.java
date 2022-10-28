package Assignments8;

import java.util.Stack;

public class MinAfterEveryPopInStack {

	public static void main(String[] args) {
		int[] arr={1, 6, 43, 1, 2, 0, 5};
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			st.push(arr[i]);
		}
		
		while(!st.isEmpty())
		{
			int min=Integer.MAX_VALUE;
			for(int x:st)
			{
				if(x<min)
					min=x;
			}
			System.out.print(min+" ");
			st.pop();
			
		}
	}

}
