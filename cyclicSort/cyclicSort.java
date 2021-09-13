package cyclicSort;

import java.util.Arrays;

public class cyclicSort 
{
	public static void main(String[] args) 
	{
		cyclic_Sort(new int[] {5,4,3,2,1});
	}
	public static void cyclic_Sort(int arr[]) 
	{
		for (int i = 0; i < arr.length;) 
		{
			if (i==arr[i]-1) 
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
		System.out.println(Arrays.toString(arr));
	}

}
