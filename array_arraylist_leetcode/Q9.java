package array_arraylist_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q9 
{
//	[Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
	public static void main(String[] args) 
	{
		int x[]={0,1,2,3,4};
		int y[]={0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(x,y)));
		
	}
	 public static int[] createTargetArray(int[] nums, int[] index) 
	 {
		 ArrayList<Integer>outputx= new ArrayList<>();
		 for (int i = 0; i < index.length; i++) 
		 {
			outputx.add(index[i], nums[i]);
		}
		int []output= new int[index.length];
		for (int i = 0; i < output.length; i++) 
		{
			output[i]=outputx.get(i);
		}
		return output;
	        
     }

}
