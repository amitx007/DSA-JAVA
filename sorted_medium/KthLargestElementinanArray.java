package sorted_medium;

public class KthLargestElementinanArray 
{
//	https://leetcode.com/problems/kth-largest-element-in-an-array/
	public static void main(String[] args) 
	{
		
	}
    public int findKthLargest(int[] nums, int k) 
    {
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
    	return nums[nums.length-k];
    	
    }

}

