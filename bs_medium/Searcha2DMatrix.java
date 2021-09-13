package bs_medium;

public class Searcha2DMatrix 
{
//	https://leetcode.com/problems/search-a-2d-matrix/
	public static void main(String[] args) 
	{
		int [][]matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=100;
		System.out.println(searchMatrix(matrix, target));
	}
	public static boolean searchMatrix(int[][] matrix, int target) 
	{
		boolean output=false;
	    for (int[] is : matrix) 
	    {
	    	output=binarySearch(is, target);
			if (output) 
			{
				return output;
			}
		}
	    return output;
    }
	public static boolean binarySearch(int [] is, int target) 
	{
		int start=0;
		int end=is.length-1;
		for (; start<=end; ) 
		{
			int mid=start+(end-start)/2;
			if (is[mid]==target) 
			{
				return true;
			}
			else if (is[mid]>target) 
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
}
