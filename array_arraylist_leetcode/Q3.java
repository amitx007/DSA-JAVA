package array_arraylist_leetcode;

import java.util.Arrays;

public class Q3 
{
//	[Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
	public static void main(String[] args) 
	{
		int []input = {3,1,2,10,1};
		int output[]=runningSum(input);
		System.out.println(Arrays.toString(output));
	}
	public static int[] runningSum(int[] nums) 
	{
        int []output = new int[nums.length];
        output[0]=nums[0];
        for (int i = 1; i < output.length; i++) 
        {
			output[i]=nums[i]+output[i-1];
		}
        return output;
    }

}
