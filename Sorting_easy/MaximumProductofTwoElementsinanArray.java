package sorted_easy;

import java.util.Arrays;

public class MaximumProductofTwoElementsinanArray 
{
//	https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
	public static void main(String[] args) 
	{
		maxProduct(new int[] {5,4,3,2,1});
	}
	public static int maxProduct(int[] nums) 
	{
		for (int i = 0; i < nums.length-1; i++) 
		{
			for (int j = i+1; j>0; j--) 
			{
				if (nums[j-1]>nums[j]) 
				{
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
				else 
				{
					break;
				}
			}
		}
		return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }

}
