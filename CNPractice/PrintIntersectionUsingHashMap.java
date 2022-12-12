package CNPractice;
import java.util.*;
public class PrintIntersectionUsingHashMap {

	public static void main(String[] args) {
		int arr1[]= {2,6,8,5,4,3};
		int arr2[]= {2,3,4,7};
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
			int key=arr1[i];
			if(hm.containsKey(key))
			{
				int value=hm.get(key);
				hm.put(key,value++);
			}
			else
			{
				hm.put(key,1);
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			int key=arr2[i];
			if(hm.containsKey(key))
			{
				int freq=hm.get(key);
				if(freq>0)
				{
					System.out.println(arr2[i]);
					hm.put(key,freq--);
				}
			}
		}
	}

	}


