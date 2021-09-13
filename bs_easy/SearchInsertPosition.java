package bs_easy;

public class SearchInsertPosition 
{
//	https://leetcode.com/problems/search-insert-position/
	public static void main(String[] args) 
	{
		int nums[]= {1};
		int target=0;
		System.out.println(searchInsert(nums, target));
	}
	 public static int searchInsert(int[] nums, int target) 
	 {
		 int start=0;
		 int end=nums.length-1;
		 for (;start<=end; ) 
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
		 return start;
    
	 }

}
