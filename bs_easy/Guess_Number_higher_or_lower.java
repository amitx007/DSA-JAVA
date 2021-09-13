package bs_easy;

public class Guess_Number_higher_or_lower 
{
//	https://leetcode.com/problems/guess-number-higher-or-lower/
	public static void main(String[] args) 
	{
		
	}
//	this was the interface do not worry abt this down method
	public static int guess(int n) 
	{
		return 1;
	}
	 public static int guessNumber(int n) 
    {
        int start=1;
        int end=n;
        for (;start<=end; ) 
        {
			int mid=start+(end-start)/2;
			//pick number
			int pick=guess(mid);
			if (pick==0) 
			{
				return mid;
			}
			else if (pick==-1) 
			{
				end=mid-1;
			}
			else 
			{
				start=mid+1;
			}
		}
        return -1;
    }

}
