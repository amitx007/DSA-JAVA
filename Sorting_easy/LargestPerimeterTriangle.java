package sorted_easy;

public class LargestPerimeterTriangle 
{
//	https://leetcode.com/problems/largest-perimeter-triangle/
	public static void main(String[] args) 
	{
		System.out.println(largestPerimeter(new int[] {3,6,2,3}));
	}
	public static int largestPerimeter(int[] nums) 
	{
		for (int i = 0; i < nums.length-1; i++) 
		{
			for (int j = i+1; j>0; j--) 
			{
				if (nums[j-1]>nums[j]) 
				{
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
				else 
				{
					break;
				}
				
			}
		}
		int perimeter=0;
		for (int i = 2; i < nums.length; i++) 
		{
			if (nums[i-2]+nums[i-1]>nums[i]) 
			{
				int posans=nums[i-2]+nums[i-1]+nums[i];
				if (posans>perimeter) 
				{
					perimeter=posans;
				}
			}
		}
		return perimeter;
    }

}
