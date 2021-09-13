package cyclicSort;

import java.util.Arrays;

public class fisrt_missing_number 
{
	public static void main(String[] args) 
	{
		System.out.println(firstmissingPositive(new int[] {1,2,3,4}));;
	}
	public static int firstmissingPositive(int []nums) 
	{
		for (int i = 0; i < nums.length; ) 
		{
			if (nums[i]<0 || nums[i]-1==i) 
			{
				i++;
			}
			else 
			{
				int index=nums[i]-1;
				int temp=nums[index];
				nums[index]=nums[i];
				nums[i]=temp;
			}
		}
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]-1!=i) 
			{
				return i+1;
			}
		}
		return nums.length+1;
	}

}
