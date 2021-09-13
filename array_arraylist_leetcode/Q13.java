package array_arraylist_leetcode;

import java.util.Arrays;

public class Q13 
{
//	[Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
	public static void main(String[] args) 
	{
		int [][]input = {{1,1,0,0},
						{1,0,0,1},
						{0,1,1,1},
						{1,0,1,0}
						};
		int [][]output=flipAndInvertImage(input);
		for (int[] is : output) 
		{
			System.out.println(Arrays.toString(is));
		}
	}
	public static int[][] flipAndInvertImage(int[][] image) 
	{
        int [][]output= new int[image.length][image[0].length];

        for (int i = 0; i < output.length; i++) 
        {
			for (int j = 0; j < output.length; j++) 
			{
				output[i][j]=image[i][output.length-1-j];
				if (output[i][j]==1) 
				{
					output[i][j]=0;
				}
				else 
				{
					output[i][j]=1;
				}
			}
		}
        return output;
    }
}
