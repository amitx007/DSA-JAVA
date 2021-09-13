package array_arraylist_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19 
{
//	[Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
	public static void main(String[] args) 
	{
		int [][]inputs= {{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};
		System.out.println(maximumPopulation(inputs));
	}
	public static int maximumPopulation(int[][] logs) 
	{
        int counter=-1;
        int year=-1;
        if (logs[0][0]>=1950  & logs[0][1]<=2050) 
        {
			counter=1;
			year=logs[0][0];
		}
        for (int i = 1; i < logs.length; i++) 
        {
        	int count=0;
        	if (logs[i][0]>=1950  & logs[i][1]<=2050) 
        	{
				count++;
			}
        	if (logs[i-1][1]-1==(logs[i][0])) 
        	{
				count++;
			}
        	if (count>counter) 
        	{
				counter=count;
				year=logs[i][0];
			}
		}
        return year;
    }

}
