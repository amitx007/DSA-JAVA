package sorted_easy;

public class SetMismatch 
{
//	https://leetcode.com/problems/set-mismatch/
	public static void main(String[] args) 
	{
		
	}
	public static int[] findErrorNums(int[] nums) 
	{
		for (int i = 0; i < nums.length;) 
		{
			if (nums[i]-1==i || nums[i]==nums[nums[i]-1]) 
			{
				i++;
			}
			else 
			{
				int index=nums[i]-1;
				int temp=nums[index];
				nums[index]=nums[i];
				nums[i]=temp;
			}
		}
		
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]-1!=i) 
			{
				return new int[] {nums[i],i+1};
			}
		}
		return new int[] {-1,-1};
    }

}
