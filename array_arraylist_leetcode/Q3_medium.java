package array_arraylist_leetcode;

import java.util.Arrays;

public class Q3_medium 
{
//	[Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
	public static void main(String[] args) {
		int []input= {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(input)));
	}
	 public static int[] productExceptSelf(int[] nums) 
	 {
	     int []prefix= new int[nums.length+1];
	     int []suffix= new int[nums.length+1];
	     prefix[0]=1;
	     suffix[suffix.length-1]=1;
	     for (int i = 1; i < suffix.length-1; i++) 
	     {
			prefix[i]=prefix[i-1]*nums[i-1];
			suffix[suffix.length-1-i]=suffix[suffix.length-i]*nums[nums.length-i];
		}
	     int []output=new int[nums.length];
	     for (int i = 1; i < suffix.length; i++) 
	     {
			output[i-1]=suffix[i]*prefix[i-1];
		}
	     return output;
	     
    }

}
