package bs_easy;

public class ArrangingCoins 
{
	public static void main(String[] args) 
	{
		System.out.println(arrangeCoins(8));
	}
	public static int arrangeCoins(int n) 
	{
		int count=0;
		for (int i = 1; i <=n; i++) 
		{
			n=n-i;
			count++;
		}
		return count;
    }
}
