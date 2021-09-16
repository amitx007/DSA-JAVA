package sorted_easy;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum 
{
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(twoSum(new int[] {3,3}, 6)));
	}
	public static int[] twoSum(int[] nums, int target) 
	{
		ArrayList<Integer> x= new ArrayList<>();
		for (int i = 0; i < nums.length; i++) 
		{
			x.add(nums[i]);
		}
		
		for(int i = 0; i < nums.length; i++){
            int num = nums[i]; 
            int rem = target - num;
            if(x.contains(rem)){ 
                int index = x.indexOf(rem); 
                if(index == i) continue; 
                return new int[]{i, index}; 
            }
        }
		return new int[] {};
    }
}
