package sorted_medium;

import java.util.Arrays;

public class FindtheDuplicateNumber 
{
//	https://leetcode.com/problems/find-the-duplicate-number/
	public static void main(String[] args) 
	{
		findDuplicate(new int[] {1,3,4,2,2});
	}
	public static int findDuplicate(int[] nums) 
	{
		for (int i = 0; i < nums.length;) 
		{
			if (nums[i]==nums[nums[i]-1]) 
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
		System.out.println(Arrays.toString(nums));
		
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]-1!=i) 
			{
				return nums[i];
			}
		}
		return -1;
		
		
    }
}
