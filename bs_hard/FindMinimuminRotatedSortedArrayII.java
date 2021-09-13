package bs_hard;

public class FindMinimuminRotatedSortedArrayII 
{
//	https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
	public static void main(String[] args) 
	{
		
	}
	public static int findMin(int[] nums) 
	{
		int pivot=findpivot(nums);
		if (pivot==-1) 
		{
			return nums[0];
		}
		return nums[pivot+1];
    }
	public static int findpivot(int []nums) 
	{
		int start=0;
		int end=nums.length-1;
		
		for (; start<=end;) 
		{
			int mid=start+(end-start)/2;
			if (mid+1!= nums.length && nums[mid]>nums[mid+1]) 
			{
				return mid;
			}
			else if (mid-1!=-1 && nums[mid]<nums[mid-1]) 
			{
				return mid-1;
			}
			else 
			{
				if (nums[start]==nums[mid] && nums[mid]==nums[end]) 
				{
					if ( start+1 != nums.length&& nums[start]>nums[start+1]) 
					{
						return start;
					}
					if (end-1 != -1 && nums[end]<nums[end-1]) 
					{
						return end-1;
					}
					start++;
					end--;
				}
				else if (nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])) 
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
}
