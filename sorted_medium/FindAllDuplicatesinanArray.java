package sorted_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindAllDuplicatesinanArray 
{
//	https://leetcode.com/problems/find-all-duplicates-in-an-array/
	public static void main(String[] args) 
	{
		findDuplicates(new int[] {4,3,2,7,8,2,3,1});
	}
	public static List<Integer> findDuplicates(int[] nums) 
	{
		for (int i = 0; i < nums.length;) 
		{
			if (nums[i]-1==i || nums[i]==nums[nums[i]-1]) 
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
		List<Integer> output=new ArrayList<>();
		
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]-1!=i) 
			{
				output.add(nums[i]);
			}
		}
		return output;
    }

}
