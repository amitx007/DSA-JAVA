package sorted_easy;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence 
{
//	https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
	public static void main(String[] args) 
	{
		System.out.println(canMakeArithmeticProgression(new int[] {5,4,3,2,1}));
		
	}
	public static boolean canMakeArithmeticProgression(int[] arr) 
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j =i+1; j>0; j--) 
			{
				if (arr[j-1]>arr[j]) 
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else 
				{
					break;
				}
			}
		}
		int dif=arr[1]-arr[0];
		for (int i = 2; i < arr.length; i++) 
		{
			if (dif!=(arr[i]-arr[i-1])) 
			{
				return false;
			}
		}
		return true;
    }

}
