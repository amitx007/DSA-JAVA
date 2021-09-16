package sorted_easy;


public class ArrayPartitionI 
{
//	https://leetcode.com/problems/array-partition-i/
	public static void main(String[] args) 
	{
		System.out.println(arrayPairSum(new int[] {1,4,3,2}));;
	}
	public static int arrayPairSum(int[] nums) 
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
				else {
					break;
				}
			}
		}
		int output=0;
		for (int i = 0; i < nums.length-1; i+=2) 
		{
			output+=Math.min(nums[i], nums[i+1]);
		}
		return output;
    }

}
