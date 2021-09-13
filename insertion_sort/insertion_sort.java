package insertion_sort;

import java.util.Arrays;

public class insertion_sort 
{
	public static void main(String[] args) 
	{
		insertion_sort(new int[] {4,5,6,1,2,3});
	}
	public static void insertion_sort(int arr[]) 
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = i+1; j>0; j--) 
			{
				if (arr[j-1]>arr[j]) 
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				else 
				{
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
