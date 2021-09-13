package bs_medium;


public class SingleElementinaSortedArray 
{
//	https://leetcode.com/problems/single-element-in-a-sorted-array/
	public static void main(String[] args) 
	{
		int nums[]= {3,3,4,4,5};
		System.out.println(singleNonDuplicate(nums));
	}
	public static int singleNonDuplicate(int[] nums) 
	{
		 int start=0; 
		 int end=nums.length-1;
		 
		 if(nums.length == 0) return -1;
	     else if(nums.length ==1) return nums[0];
	     else if(nums[0] != nums[1]) return nums[0];
	     else if(nums[end] != nums[end-1]) return nums[end];
		 
		 for (; start<=end; ) 
		 {
			int mid=start+(end-start)/2;
			if ( nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) 
			{
				return nums[mid];
			}
			
			else if (mid%2==0) 
			{
				if (nums[mid]==nums[mid+1]) 
				{
					start=mid+1;
				}
				else 
				{
					end=mid-1;
				}
			}
			else 
			{
				if (nums[mid]==nums[mid-1]) 
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
