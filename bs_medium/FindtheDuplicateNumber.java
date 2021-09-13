package bs_medium;

import java.util.HashMap;

public class FindtheDuplicateNumber 
{
	public static void main(String[] args) 
	{
		int nums[] = {3,1,3,4,2};
		System.out.println(findDuplicate(nums));
	}
	public static int findDuplicate(int[] nums) 
	{
		HashMap<Integer, Integer> list= new HashMap<>();
		for (int i = 0; i < nums.length; i++) 
		{
			if (!list.containsKey(nums[i])) 
			{
				list.put(nums[i], 1);
			}
			else 
			{
				int value=list.get(nums[i]);
				value++;
				list.put(nums[i], value);
			}
			
		}
		Object values[]=list.values().toArray();
		Object key[]=list.keySet().toArray();
		for (int i = 0; i < values.length; i++) 
		{
			if ((int)values[i]>=2) 
			{
				return (int)key[i];
			}
		}
		return -1;
    }

}
