package bs_medium;

public class Find_peak 
{
//	https://leetcode.com/problems/find-peak-element/
	public static void main(String[] args) 
	{
		
	}
	public static int findPeakElement(int[] nums) 
	{
		int start=0;
		int end=nums.length-1;
		for (; start<end;) 
		{
			int mid=start+(end-start)/2;
			if (nums[mid]<nums[mid+1]) 
			{
				start=mid+1;
			}
			else 
			{
				end=mid;
			}
		}
		return start;
    }

}
