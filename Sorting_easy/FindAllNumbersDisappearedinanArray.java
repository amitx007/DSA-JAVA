package sorted_easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray 
{
//	https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	public static void main(String[] args) 
	{
		System.out.println(findDisappearedNumbers(new int[] {1,1}));
	}
  
	public static List<Integer> findDisappearedNumbers(int[] nums) 
	{
		for (int i = 0; i < nums.length;) 
		{
			if (nums[i]==i+1 || nums[i]==nums[nums[i]-1]) 
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
		List<Integer>output=new ArrayList<>();
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]-1!=i) 
			{
				output.add(i+1);
			}
		}
		return output;
		
    }
}
