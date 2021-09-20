package string_easy;

public class SplitaStringinBalancedStrings 
{
//	https://leetcode.com/problems/split-a-string-in-balanced-strings/
	public static void main(String[] args) 
	{
		
	}
	public static int balancedStringSplit(String s) 
	{
		int count=0;
		int x=0;
		for (int i = 0; i <s.length(); i++) 
		{
			if (s.charAt(i)=='R') 
			{
				x--;
			}
			else 
			{
				x++;
			}
			if (x==0) 
			{
				count++;
			}
		}
		return count;
    }

}
