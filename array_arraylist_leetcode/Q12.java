package array_arraylist_leetcode;

public class Q12 
{
//	[Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
	public static void main(String[] args) 
	{
		int []input = {-4,-3,-2,-1,4,3,2};
		System.out.println(largestAltitude(input));
	}
	public static int largestAltitude(int[] gain) 
	{
        int []outputarray= new int[gain.length+1];
        outputarray[0]=0;
        for (int i = 1; i < outputarray.length; i++) 
        {
        	outputarray[i]=gain[i-1]+outputarray[i-1];
		}
        int output=Integer.MIN_VALUE;
        for (int i = 0; i < outputarray.length; i++) 
        {
			if (outputarray[i]>output) 
			{
				output=outputarray[i];
			}
		}
        return output;
    }

}
