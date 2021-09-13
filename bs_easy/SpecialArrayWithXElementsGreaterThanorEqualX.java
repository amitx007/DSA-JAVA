package bs_easy;

public class SpecialArrayWithXElementsGreaterThanorEqualX 
{
//	https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
	public static void main(String[] args) 
	{
		int [] nums= {3,6,7,7,0};
		System.out.println(specialArray(nums));
	}
	public static int specialArray(int[] nums) 
	{
		int count=0;
		int x=0;
		for (int i = 0; x<=nums.length && i < nums.length; i++) 
		{
			if (x<=nums[i]) 
			{
				count++;
			}
			if (i==nums.length-1) 
			{
				if (count==x) 
				{
					return x;
				}
				else 
				{
					count=0;
					x++;
					i=-1;
				}
			}
		}
		return -1;
    }

}
