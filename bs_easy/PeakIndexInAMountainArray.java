package bs_easy;

public class PeakIndexInAMountainArray 
{
//	https://leetcode.com/problems/peak-index-in-a-mountain-array/
	public static void main(String[] args) 
	{
		int [] arr= {3,4,5,1};
		System.out.println(peakIndexInMountainArray(arr));
		
	}
	public static int peakIndexInMountainArray(int[] arr) 
	{
        int start=0;
        int end=arr.length-1;
        for (;start<end;) 
        {
			int mid=start+(end-start)/2;
			if (arr[mid]<arr[mid+1]) 
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