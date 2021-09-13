package cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findalldissapearedinanarray 
{
	public static void main(String[] args) 
	{
		System.out.println(cyclicsort(new int[] {4,3,2,7,8,2,3,1}));;
	}
	//sorting
	public static List<Integer> cyclicsort(int arr[]) 
	{
		//array starts from 1-n
		//it contain duplicates
		for (int i = 0; i < arr.length;) 
		{
			if (i==arr[i]-1) 
			{
				i++;
			}
			else 
			{
				if (arr[i]==arr[arr[i]-1]) 
				{
					i++;
				}
				else 
				{
					int index=arr[i]-1;
					int temp=arr[index];
					arr[index]=arr[i];
					arr[i]=temp;
				}
			}
		}
		List<Integer>solution=new ArrayList<>();
		//finding missing number
		for (int i = 0; i < arr.length;i++) 
		{
			if (arr[i]!=i+1) 
			{
				solution.add(i+1);
			}
		}
		return solution;
//		if (arr[arr.length-1]==arr.length || solution.contains(arr.length)) 
//		{
//			return solution;
//		}
//		else 
//		{
//			solution.add(arr.length);
//			return solution;
//		}
	}
}
