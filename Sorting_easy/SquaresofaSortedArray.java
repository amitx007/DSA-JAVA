package sorted_easy;

public class SquaresofaSortedArray 
{
//	https://leetcode.com/problems/squares-of-a-sorted-array/
	public static void main(String[] args) 
	{
		
	}
	public static int[] sortedSquares(int[] nums) 
	{
		for (int i = 0; i < nums.length; i++) 
		{
			nums[i]=nums[i]*nums[i];
		}
		for (int i = 0; i < nums.length-1; i++) 
		{
			for (int j = i+1; j>0; j--) 
			{
				if (nums[j-1]>nums[j]) 
				{
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
				else 
				{
					break;
				}
			}
		}
		return nums;
    
	}

}
