package bs_easy;

public class First_Bad_Version 
{
	
//	https://leetcode.com/problems/first-bad-version/
	public static void main(String[] args) 
	{
		
	}
    public int firstBadVersion(int n) 
    {
        int start=1;
        int end=n;
        for (;start<end;) 
        {
			int mid=start+(end-start)/2;
			if (isBadVersion(mid)) 
			{
				end=mid;
			}
			else 
			{
				start=mid+1;
			}
		}
        return start;
    }
	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
