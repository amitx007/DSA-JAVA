package bs_easy;

public class CountNegativeNumbersInASortedMatrix 
{
//	https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
	public static void main(String[] args) 
	{
		int input[][]= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(countNegatives(input));
	}
	public static int countNegatives(int[][] grid) 
    {
		int output=0;
        for (int[] is : grid) 
        {
			output+=binary_search(is);
		}
        return output;
    }
	public static int binary_search(int []arr) 
	{
		int count=0;
		int start=0;
		int end=arr.length-1;
		for (; start<=end ; ) 
		{
			int mid=start+(end-start)/2;
			if (arr[mid]>=0) 
			{
				start=mid+1;
			}
			else 
			{
				count+=end-mid+1;
				end=mid-1;
			}
		}
		return count;
	}
}
