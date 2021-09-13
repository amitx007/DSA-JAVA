package array_arraylist_leetcode;

import java.util.Arrays;

public class Q8 
{
//	[How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
	public static void main(String[] args) 
	{
		int []input = {7,7,7,7};
		int output[]=smallerNumbersThanCurrent(input);
		System.out.println(Arrays.toString(output));
	}
	public static int[] smallerNumbersThanCurrent(int[] nums) 
	{
		int []output = new int[nums.length];
		for (int i = 0; i < output.length; i++) 
		{
			int x=0;
			for (int j = 0; j < output.length; j++) 
			{
				if (nums[i]>nums[j]) 
				{
					x++;
				}
			}
			output[i]=x;
		}
		return output;
    }

}
