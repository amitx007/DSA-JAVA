package bs_hard;

public class FindinMountainArray 
{
//	https://leetcode.com/problems/find-in-mountain-array/
	public static void main(String[] args) 
	{
		
	}
	public int findInMountainArray(int target, MountainArray mountainArr) 
	{
		int peak=findpeak(mountainArr);
		int output=binarySearch(mountainArr, target, 0, peak, true);
		if (output==-1) 
		{
			output=binarySearch(mountainArr, target, peak, mountainArr.length()-1, false);
		}
		return output;
	}
	public static int findpeak(MountainArray mountainArr) 
	{
		int start=0;
		int end=mountainArr.length()-1;
		for (; start<end; ) 
		{
			int mid=start+(end-start)/2;
			if (mountainArr.get(mid)<mountainArr.get(mid+1)) 
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
	public static int binarySearch(MountainArray mountainArr,int target,int start,int end,boolean isascending) 
	{
		for (; start<=end; ) 
		{
			int mid=start+(end-start)/2;
			if (mountainArr.get(mid)==target) 
			{
				return mid;
			}
			else if (mountainArr.get(mid)>target) 
			{
				if (isascending) 
				{
					end=mid-1;
				}
				else 
				{
					start=mid+1;
				}
			}
			else 
			{
				if (isascending) 
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
	interface MountainArray {
    public int get(int index);
		   public int length();
	}
}
