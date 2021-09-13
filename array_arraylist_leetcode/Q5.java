package array_arraylist_leetcode;

import java.util.Arrays;

public class Q5 
{
//	[Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
	public static void main(String[] args) 
	{
		int []input = {1,1,2,2};
		int output[]=shuffle(input,2);
		System.out.println(Arrays.toString(output));
	}
	 public static int[] shuffle(int[] nums, int n) 
	 {
		 int [] output= new int[nums.length];
		 int x=0;
		 int y=n;
		 for (int i = 0; i < n; i++) 
		 {
			output[x]=nums[i];
			output[x+1]=nums[y];
			x+=2;
			y+=1;
		}
		 return output;
	        
	 }

}
