package bs_easy;

import java.util.Arrays;

public class Two_Sum_II_Input_array_is_sorted 
{
//	https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
	public static void main(String[] args) 
	{
		int []numbers= {2,7,11,15
				};
		int target=9;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}
	public static int[] twoSum(int[] numbers, int target) 
	{
		int start=0;
		int end=numbers.length-1;
		for (; start<=end ; ) 
		{
			int mid=start+(end-start)/2;
			if (numbers[start]+numbers[end]>target) 
			{
				end=(numbers[mid]+numbers[start] >target)? mid: end-1 ;
			}
			else if (numbers[start]+numbers[end]<target) 
			{
				start=(numbers[mid]+numbers[end] < target)? mid : start+1;
			}
			else 
			{
				return new int[] {start+1,end+1};
			}
		}
		return new int[] {-1,-1};
    }

}
