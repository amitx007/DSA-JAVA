package binary_search_interview;

import java.util.Arrays;
import java.util.Iterator;

public class Q1_medium 
{
//	[Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
	public static void main(String[] args) 
	{
		int []input= {1};
		int target=0;
		System.out.println(Arrays.toString(searchRange(input,target)));
	}
	 public static int[] searchRange(int[] nums, int target) 
	 {
		int output[]= {-1,-1};
		int starting=returnindex(nums, target, true);
		int ending=returnindex(nums, target, false);
		output[0]=starting;
		output[1]=ending;
		return output;
	 }
	 public static int returnindex(int[] nums, int target,Boolean firststart) 
	 {
		int start=0;
		int end=nums.length-1;
		int ans=-1;
		for (;start<=end;) 
		{
			int mid=start+((end-start)/2);
			if (target>nums[mid]) 
			{
				start=mid+1;
			}
			else if (target<nums[mid]) 
			{
				end=mid-1;
			}
			else 
			{
				ans=mid;
				if (firststart) 
				{
					end=mid-1;
				}
				else 
				{
					start=mid+1;
				}
			}
		}
		return ans;
	}

}
