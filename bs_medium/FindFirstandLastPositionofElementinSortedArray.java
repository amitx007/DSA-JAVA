package bs_medium;

public class FindFirstandLastPositionofElementinSortedArray 
{
	public static void main(String[] args) 
	{
	}
	public static int[] searchRange(int[] nums, int target) 
	{
		int output[]= {-1,-1};
		output[0]=binarySearch(nums, target, true);
		output[1]=binarySearch(nums, target, false);
		return output;
	}
	public static int binarySearch(int[] nums, int target,boolean isstart) 
	{
		int start=0;
		int end=nums.length-1;
		int isPossibleans=-1;
		for (; start<=end;) 
		{
			int mid=start+(end-start)/2;
			if (nums[mid]>target) 
			{
				end=mid-1;
			}
			else if (nums[mid]<target) 
			{
				start=mid+1;
			}
			else 
			{
				isPossibleans=mid;
				if (isstart) 
				{
					end=mid-1;
				}
				else 
				{
					start=mid+1;
				}
			}
		}
		return isPossibleans;
	}

}
