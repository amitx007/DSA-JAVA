package array_arraylist_leetcode;

public class Q4 
{
//	[Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
	public static void main(String[] args) 
	{
		int [][]input= {{2,8,7},{7,1,3},{1,9,5}};
		System.out.println(maximumWealth(input));
	}
	 public static int maximumWealth(int[][] accounts) 
	 {
		 int output=0; 
		 for (int i = 0; i < accounts.length; i++) 
		 {
			 int sum=0;
			for (int j = 0; j < accounts[i].length; j++) 
			{
				sum+=accounts[i][j];
			}
			if (sum>output) 
			{
				output=sum;
			}
		}
		 return output;
		 
	 }

}
