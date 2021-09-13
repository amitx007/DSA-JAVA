package array_arraylist_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1_medium 
{
//	[Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
	public static void main(String[] args) 
	{
		int [][] input= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(Arrays.toString(spiralOrder(input).toArray()));
	}
	 public static List<Integer> spiralOrder(int[][] matrix) 
	 {
		 List<Integer>output = new ArrayList<>();
		 int rowmin=0;
		 int rowmax=matrix.length-1;
		 int columnmin=0;
		 int columnmax=(matrix[0].length)-1;
		 for (int j=1;j<=matrix.length*matrix[0].length; ) 
		 {
			 for (int i = columnmin; i <=columnmax & j<=matrix.length*matrix[0].length; i++) 
				{
					output.add(matrix[rowmin][i]);
					j++;
				}
				rowmin+=1;
				for (int i = rowmin; i <= rowmax & j<=matrix.length*matrix[0].length; i++) 
				{
					output.add(matrix[i][columnmax]);
					j++;
				}
				columnmax-=1;
				for (int i = columnmax; i>=columnmin & j<=matrix.length*matrix[0].length; i--) 
				{
					output.add(matrix[rowmax][i]);
					j++;
				}
				rowmax-=1;
				for (int i = rowmax; i>=rowmin & j<=matrix.length*matrix[0].length; i--) 
				{
					output.add(matrix[i][columnmin]);
					j++;
				}
				columnmin+=1;
			
		}
		
		 return output;
		 
	 }

}
