package array_arraylist_leetcode;

public class Q16 
{
//	 [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
	public static void main(String[] args) 
	{
		int []input = {555,901,482,1771};
		System.out.println(findNumbers(input));
	}
	public static int findNumbers(int[] nums) 
	{
        int output=0;
        for (int i = 0; i < nums.length; i++) 
        {
			int length=(nums[i]+"").length();
			if (length%2==0) 
			{
				output++;
			}
		}
        return output;
    }

}
