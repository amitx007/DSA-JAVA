package array_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 
{
	public static void main(String[] args) 
	{
		//rotate the array k time right 
		//time complexity - o(n)
		//space complexity -o(1)
		Scanner sc=new Scanner(System.in);
		int []nums = {1,2,3,4,5};
		int k=-2;
		if (k<0) {
			k=(k+nums.length);
		}
		k=k%(nums.length);
		
		
		ArrayList<Integer> output =new ArrayList<>();
		for (int i = nums.length-k; i < nums.length; i++) 
		{
			output.add(nums[i]);
		}
		for (int i = 0; i < nums.length-k; i++) 
		{
			output.add(nums[i]);
		}
		System.out.println(output);
		
//		another way of writing the for loop 
		for (int i = 0; i < nums.length; i++) 
		{
			if (i<k) 
			{
				System.out.print(nums[i+nums.length-k]+" ");
			}
			else 
			{
				System.out.print(nums[i-k]+" ");
			}
		}
	}

}
