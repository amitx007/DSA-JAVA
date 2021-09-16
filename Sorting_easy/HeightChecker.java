package sorted_easy;

public class HeightChecker 
{
//	https://leetcode.com/problems/height-checker/
	public static void main(String[] args) 
	{
		
	}
	public static int heightChecker(int[] heights) 
	{
		int expected[]=new int[heights.length];
		for (int i = 0; i < expected.length; i++) 
		{
			expected[i]=heights[i];
		}
		for (int i = 0; i < expected.length-1; i++) 
		{
			for (int j = i+1; j>0; j--) 
			{
				if (expected[j-1]>expected[j]) 
				{
					int temp=expected[j-1];
					expected[j-1]=expected[j];
					expected[j]=temp;
				}
				else 
				{
					break;
				}
			}
		}
		int output=0;
		for (int i = 0; i < expected.length; i++) 
		{
			if (expected[i]!=heights[i]) 
			{
				output++;
			}
		}
		return output;
    }

}
