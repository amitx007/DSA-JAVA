package array_arraylist_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4_medium 
{
//	 [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
	public static void main(String[] args) 
	{
		int []input= {};
		System.out.println(Arrays.toString(searchRange(input, 0)));
	}
	 public static int[] searchRange(int[] nums, int target) 
	 {  
		 ArrayList<Integer>position=new ArrayList<>();
		 for (int i = 0; i < nums.length; i++) 
		 {
			if (nums[i]==target) 
			{
				position.add(i);
			}
		}
		 if (position.size()==0) 
		 {
			 int[]x= {-1,-1};
			return x;
		}
		 int []output= {position.get(0),position.get(position.size()-1)};
		 return output;
	 }

}
