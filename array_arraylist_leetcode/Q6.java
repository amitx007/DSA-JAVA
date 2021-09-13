package array_arraylist_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 
{
//	[Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
	public static void main(String[] args) 
	{
		int []input = {12,1,12};
		System.out.println(kidsWithCandies(input,10));
	}
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
	 {
		 List<Boolean> output = new ArrayList<Boolean>();
		 int max=0;
		 for (int i = 0; i < candies.length; i++) 
		 {
			if (candies[i]>max) 
			{
				max=candies[i];
			}
		 }
		 for (int i = 0; i < candies.length; i++) 
		 {
			if (candies[i]+extraCandies>=max) 
			{
				output.add(true);
			}
			else 
			{
				output.add(false);
			}
		}
		 return output;
	 }

}
