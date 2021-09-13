package bs_easy;

public class KthMissingPositiveNumber 
{
//	https://leetcode.com/problems/kth-missing-positive-number/
	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4};
		int k=2;
		System.out.println(findKthPositive(arr, k));
	}
	public static int findKthPositive(int[] arr, int k) 
	{
		int index=0;
		int ans=-1;
		for (int i = 0; k>=0; i++) 
		{
			if (index<arr.length && arr[index]==i) 
			{
				index++;
			}
			else 
			{
				ans=i;
				k--;
			}
		}
		return ans;
    }

}
