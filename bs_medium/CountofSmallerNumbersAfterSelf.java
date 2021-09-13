package bs_medium;

import java.util.ArrayList;
import java.util.List;

public class CountofSmallerNumbersAfterSelf 
{
//	https://leetcode.com/problems/count-of-smaller-numbers-after-self/
	public static void main(String[] args) 
	{
		int nums[]= {-1,-1};
		System.out.println(countSmaller(nums));
	} 
	public static List<Integer> countSmaller(int[] nums) 
	{
        List<Integer> output=new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) 
        {
			output.add(search(nums, i));
		}
        return output;
    }
	//smaller numbers
	public static int search(int[]nums,int start) 
	{
		int counter=0;
		for (int i = start; i < nums.length; i++) 
		{
			if (nums[start]>nums[i]) 
			{
				counter++;
			}
		}
		return counter;
	}
}
