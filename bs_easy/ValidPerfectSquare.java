package bs_easy;

public class ValidPerfectSquare 
{
//	https://leetcode.com/problems/valid-perfect-square/
	public static void main(String[] args) 
	{
		System.out.println(isPerfectSquare(24));
	}
	public static boolean isPerfectSquare(int num) 
	{
		double start=0;
		double end=num;
		for (; start<=end ; ) 
		{
			double mid=start+(int)(end-start)/2;
			if (mid*mid==num) 
			{
				return true;
			}
			else if (mid*mid>num) 
			{
				end=mid-1;
			}
			else 
			{
				start=mid+1;
			}
		}
		return false;
    }

}
