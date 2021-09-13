package linear_search;

import java.util.Arrays;

public class Searching2darray 
{
	public static void main(String[] args) 
	{
		int[][] input={
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
		int target=56;
		System.out.println(Arrays.toString(searchingin2d(input, target)));
		System.out.println(findmax(input));
	}
	public static int findmax(int[][] input) 
	{
		int max=Integer.MIN_VALUE;
		for (int[] is : input) 
		{
			for (int is2 : is) 
			{
				if (is2>max) 
				{
					max=is2;
				}
			}
		}
		return max;
	}
	public static int[] searchingin2d(int [][] arr,int target) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				if (target==arr[i][j]) 
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}

}
