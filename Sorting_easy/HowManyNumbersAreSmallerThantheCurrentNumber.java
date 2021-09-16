package sorted_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HowManyNumbersAreSmallerThantheCurrentNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] {7})));
	}
	public static int[] smallerNumbersThanCurrent(int[] nums) 
	{
		
		int ans[]=new int[nums.length];
		for (int i = 0; i < ans.length; i++) 
		{
			ans[i]=nums[i];
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
			}
		}
        
       ArrayList<Integer> x=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) 
        {
			x.add(nums[i]);
		}
        for (int i = 0; i < ans.length; i++) 
        {
			ans[i]=x.indexOf(ans[i]);
		}
        return ans;
    }

}
