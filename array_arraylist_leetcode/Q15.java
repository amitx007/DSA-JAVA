package array_arraylist_leetcode;

public class Q15 
{
	public static void main(String[] args) 
	{
		int [][]input = {{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
				};
		System.out.println(diagonalSum(input));
	}
	public static int diagonalSum(int[][] mat) 
	{
		int sum=0;
		for (int i = 0; i < mat.length; i++) 
		{
			int row1=i;
			int row2=mat.length-1-i;
			if (row1==row2) 
			{
				sum+=mat[i][i];
			}
			else 
			{
				sum+=mat[i][row1]+mat[i][row2];
			}
		}
		return sum;
    }

}
