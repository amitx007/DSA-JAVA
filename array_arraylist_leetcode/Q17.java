package array_arraylist_leetcode;

import java.util.Arrays;

public class Q17 
{
//	[Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)
	public static void main(String[] args) 
	{
		int [][]input = {{1,2,3},
				{4,5,6},
				};
		int [][]output=transpose(input);
		for (int[] is : output) 
		{
			System.out.println(Arrays.toString(is));
		}
	}
	 public static int[][] transpose(int[][] matrix) 
	 {
		 int[][]output = new int[matrix[0].length][matrix.length];
	     for (int i = 0; i < output.length; i++) 
	     {
			for (int j = 0; j < output[i].length; j++) 
			{
				output[i][j]=matrix[j][i];
			}
		}   
	     return output;
    
	 }

}
