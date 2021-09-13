package selection_sort;

import java.util.Arrays;

public class selection_sort 
{
	public static void main(String[] args) 
	{
		selectionSort(new int[]{-1,-2,-3,-4,-5 });
	}
	public static void selectionSort(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int last=arr.length-1-i;
			int max=0;
			for (int j = 1; j < arr.length-i; j++) 
			{
				if (arr[j]>arr[max]) 
				{
					max=j;
				}
			}
			int temp=arr[last];
			arr[last]=arr[max];
			arr[max]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
