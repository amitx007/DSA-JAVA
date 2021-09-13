package bs_medium;

public class SearchinRotatedSortedArrayII 
{
//	https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
	public static void main(String[] args) 
	{
		
	}
	public static boolean search(int[] nums, int target) 
    {
		int findPivot=findpivot(nums);
		if (findPivot==-1) 
		{
			return binarySearch(nums, target, 0, nums.length-1);
		}
		boolean output=binarySearch(nums, target, 0, findPivot);
		if (!output) 
		{
			output=binarySearch(nums, target, findPivot+1, nums.length-1);
		}
		return output;
    }
	public static boolean binarySearch(int nums[],int target,int start,int end) 
	{
		for (; start<=end; ) 
		{
			int mid=start+(end-start)/2;
			if (nums[mid]== target) 
			{
				return true;
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
		return false;
	}
	public static int findpivot(int nums[]) 
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
