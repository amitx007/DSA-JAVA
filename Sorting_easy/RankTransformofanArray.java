package sorted_easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RankTransformofanArray 
{
//	37 / 38 test cases passed.
//	https://leetcode.com/problems/rank-transform-of-an-array/
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(arrayRankTransform(new int[] {37,12,28,9,100,56,80,5,12})));
	}
	public static int[] arrayRankTransform(int[] arr) 
	{
		int dup[]= new int[arr.length];
		for (int i = 0; i < dup.length; i++) 
		{
			dup[i]=arr[i];
		}
		
		for (int i = 0; i < dup.length-1; i++) 
		{
			for (int j = i+1; j>0; j--) 
			{
				if (dup[j-1]>dup[j]) 
				{
					int temp=dup[j-1];
					dup[j-1]=dup[j];
					dup[j]=temp;
				}
				else 
				{
					break;
				}
			}
		}
		ArrayList<Integer>x= new ArrayList<>();
		for (int i = 0; i < dup.length; i++) 
		{
			if (!x.contains(dup[i])) 
			{
				x.add(dup[i]);
			}
			
		}
		for (int i = 0; i < dup.length; i++) 
		{
			dup[i]=x.indexOf(arr[i])+1;
		}
		return dup;
    }

}
