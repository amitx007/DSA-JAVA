package array_arraylist_leetcode;

public class Q7 
{
//	[Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
	public static void main(String[] args) 
	{
		
		int []input = {1,2,3};
		System.out.println(numIdenticalPairs(input));
	}
	 public static int numIdenticalPairs(int[] nums) 
	 {
		 int output =0;
		 for (int i = 0; i < nums.length; i++) 
		 {
			for (int j = i+1; j < nums.length; j++) 
			{
				if (nums[i]==nums[j]) 
				{
					output++;
				}
			}
		}
		 return output;
	        
	 }

}
