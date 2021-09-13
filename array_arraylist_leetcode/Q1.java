package array_arraylist_leetcode;

import java.util.Arrays;

public class Q1 
{
//	1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
	public static void main(String[] args) 
	{
		int input[]= {5,0,1,2,3,4};
		int x[]=buildArray(input);
		System.out.println(Arrays.toString(x));
	}
	public static int[] buildArray(int[] nums) 
	{
		int []output= new int[nums.length];
		for (int i = 0; i < output.length; i++) 
		{
			output[i]=nums[nums[i]];
		}
		return output;
    }

}
