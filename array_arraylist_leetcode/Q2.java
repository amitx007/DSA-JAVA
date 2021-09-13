package array_arraylist_leetcode;

import java.util.Arrays;

public class Q2 
{
//	[Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
	public static void main(String[] args) 
	{
		int []input = {1,3,2,1};
		int output[]=getConcatenation(input);
		System.out.println(Arrays.toString(output));
		
	}
	public static int[] getConcatenation(int[] nums) 
	{
		int [] output= new int[nums.length*2];
		int x=0;
		for (int i = 0; i < output.length; i++) 
		{
			if (i<nums.length) 
			{
				output[i]=nums[i];
			}
			else 
			{
				output[i]=nums[x];
				x++;
			}
			
		}
		return output;
    }

}
