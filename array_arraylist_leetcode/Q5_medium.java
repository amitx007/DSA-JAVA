package array_arraylist_leetcode;

public class Q5_medium 
{
//	[Jump Game](https://leetcode.com/problems/jump-game/)
	public static void main(String[] args) 
	{
		int []input= {0,2,3};
		System.out.println(canJump(input));
	}
	public static boolean canJump(int[] nums) 
	{
		int last_index=nums.length-1;
		int position=0;
        for (int i = 0; i < nums.length; i++) 
        {
        	if (nums[position]>=last_index) 
        	{
				return true;
			}
        	else 
        	{
				position+=nums[i];
			}
		}
        return false;
    }
	

}
