package Assignments8;

public class ElementsPresentOnlyInFirstArray {
	public static void main(String[] args)
	{
		int[] arr1 = {1, 2, 3, 4, 5, 10};
		int[] arr2 = {2, 3, 1, 0, 5};
		for(int i=0;i<arr1.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr1[j])
					flag=true;
			}
			if(!flag)
				System.out.print(arr1[i]+" ");
		}
	}

}
