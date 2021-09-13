package cyclicSort;

import java.util.Arrays;

public class missing_number 
{
	public static void main(String[] args) 
	{
		System.out.println(missingNumber(new int [] {3,0,1}));
		;
	}
	public static int missingNumber(int[]nums) 
	{
		//sorting
		for (int i = 0; i < nums.length;) 
		{
			if (i==nums[i]) 
			{
				i++;
			}
			else 
			{
				if (nums[i]==nums.length) 
				{
					i++;
				}
				else 
				{
					int index=nums[i];
					int temp=nums[index];
					nums[index]=nums[i];
					nums[i]=temp;
				}
			}
		}
		
		for (int i = 0; i < nums.length;) 
		{
			if (i==nums[i]) 
			{
				i++;
			}
			else 
			{
				return i;
			}
		}
		return nums.length;
	}

}
