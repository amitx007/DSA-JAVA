package sorted_medium;

import java.util.Arrays;

public class SortColors 
{
	public static void main(String[] args) {
		sortColors(new int[] {1});
	}
	public static void sortColors(int[] nums) 
	{
		for (int i = 0; i < nums.length-1; i++) 
		{
			for (int j = i+1; j >0; j--) 
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
		System.out.println(Arrays.toString(nums));
    }

}
