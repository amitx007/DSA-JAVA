package cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class find_all_duplicates_in_an_array 
{
	public static void main(String[] args) 
	{
		System.out.println(findduplicates(new int[] {1}));
	}
	public static List<Integer> findduplicates(int []arr) 
	{
		for (int i = 0; i < arr.length; ) 
		{
			if (arr[i]-1==i) 
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
		
		List<Integer> output=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]-1!=i) 
			{
				output.add(arr[i]);
			}
		}
		return output;
	}

}
