package bs_medium;

public class SearchinRotatedSortedArray 
{
//	https://leetcode.com/problems/search-in-rotated-sorted-array/
	public static void main(String[] args) 
	{
		int nums[]= {7,0,1,2,3};
		System.out.println(findPivot(nums));
	}
	public static int search(int[] nums, int target) 
	{
		int pivotPoint=findPivot(nums);
		if (pivotPoint==-1) 
		{
			return binarysearch(nums, target, 0, nums.length-1);
		}
		else 
		{
			int output=binarysearch(nums, target, 0, pivotPoint);
			if (output==-1) 
			{
				output=binarysearch(nums, target, pivotPoint+1, nums.length-1);
			}
			return output;
		}
	}
	
//	distinct elements
	public static int findPivot(int []nums) 
	{
		int start=0;
		int end=nums.length-1;
		for (; start<=end ; ) 
		{
			int mid=start+(end-start)/2;
			if (mid+1 != nums.length && nums[mid]>nums[mid+1]) 
			{
				return mid;
			}
			else if (mid-1!= -1 && nums[mid]<nums[mid-1]) 
			{
				return mid-1;
			}
			else 
			{
				if (nums[mid]>nums[start]) 
				{
					start=mid+1;
				}
				else 
				{
					end=mid-1;
				}
			}
		}
		return -1;
	}
	public static int binarysearch(int[]nums, int target,int start, int end) 
	{
		for (; start<=end; ) 
		{
			int mid=start+(end-start)/2;
			if (nums[mid]==target) 
			{
				return mid;
			}
			else if (nums[mid]>target)
			{
				end=mid-1;
			}
			else 
			{
				start=mid+1;
			}
		}
		return -1;
	}

}
