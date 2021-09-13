package cyclicSort;

import java.util.Arrays;

public class find_duplicate_numbers 
{
	public static void main(String[] args) 
	{
		System.out.println(findDuplicates(new int[] {1,2,1}));;
	}
	public static int findDuplicates(int [] arr) 
	{
		for (int i = 0; i < arr.length;) 
		{
			if (arr[i]==i+1) 
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
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]-1!=i) 
			{
				return arr[i];
			}
		}
		return -1;
	}
}
