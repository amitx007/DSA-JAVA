package bs_easy;

import java.util.Arrays;

public class FairCandySwap 
{
//	https://leetcode.com/problems/fair-candy-swap/
	public static void main(String[] args) 
	{
		int aliceSizes[]= {1,2,5};
		int []bobSizes = {2,4};
		System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
	}
	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) 
	{
		int sa=0;
		int sb=0;
		for (int i = 0; i < aliceSizes.length; i++) 
		{
			sa+=aliceSizes[i];
		}
		
		for (int i = 0; i < bobSizes.length; i++) 
		{
			sb+=bobSizes[i];
		}
		
		
		int index=0;
		for (int i = 0; i <aliceSizes.length;) 
		{
			int x=aliceSizes[i];
			int y=bobSizes[index];
			if (x==y+(sa-sb)/2) 
			{
				return new int[] {x,y};
			}
			else 
			{
				index++;
			}
			if (index==bobSizes.length) 
			{
				index=0;
				i++;
			}
		}
		return null;
    }

}
