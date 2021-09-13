package bs_medium;

public class FindMinimuminRotatedSortedArray 
{
//	https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
	public static void main(String[] args) 
	{
		int []nums= {2,3,4,5,1};
		System.out.println(findPivot(nums));
		System.out.println(findMin(nums));
	}
	public static int findMin(int[] nums) 
    {
        return nums[findPivot(nums)+1];
	}
	
	//finding pivot unique numbers
	public static int findPivot(int nums[]) 
	{
		int start=0;
		int end=nums.length-1;
		for (; start<=end; ) 
		{
			int mid=start+(end-start)/2;
			if (mid+1!=nums.length && nums[mid]>nums[mid+1]) 
			{
				return mid;
			}
			else if (mid-1!=-1 && nums[mid-1]>nums[mid]) 
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

}
