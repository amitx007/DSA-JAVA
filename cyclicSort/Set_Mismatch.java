package cyclicSort;

import java.util.Arrays;

public class Set_Mismatch 
{
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(finderrorNums(new int[] {1,2,3,4,5})));
	}
	public static int[] finderrorNums(int [] arr) 
	{
		int output[]= {-1,-1};
		for (int i = 0; i < arr.length;) 
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
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]-1!=i) 
			{
				output[0]=arr[i];
				output[1]=i+1;
			}
		}
		return output;
	}
}
