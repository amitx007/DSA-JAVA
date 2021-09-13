package array_arraylist_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_medium 
{
	public static void main(String[] args) 
	{
		int [][] input= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(input);
	}
	public static void setZeroes(int[][] matrix) 
	{
        ArrayList<Integer>rows=new ArrayList<>();
        ArrayList<Integer>column=new ArrayList<>();
        int [][]output=matrix;
        for (int i = 0; i < matrix.length; i++) 
        {
			for (int j = 0; j < matrix[0].length; j++) 
			{
				if (matrix[i][j]==0) 
				{
					rows.add(i);
					column.add(j);
				}
			}
		}
        
        for (int i = 0; i < rows.size(); i++) 
        {
        	for (int j = 0; j < output[0].length; j++) 
            {
    			output[rows.get(i)][j]=0;
    		}
		}
        for (int i = 0; i < column.size(); i++) 
        {
			for (int j = 0; j < output.length; j++) 
			{
				output[j][column.get(i)]=0;
			}
		}
        System.out.print("[");
        for (int[] is : output) {
        	System.out.print(Arrays.toString(is)+",");
		}
        System.out.println("]");
        
        
    }

}
