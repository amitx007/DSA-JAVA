package sorted_easy;

import java.util.ArrayList;

public class MergeSortedArray 
{
	public static void main(String[] args) {
		
	}
	public void merge(int[] nums1, int m, int[] nums2, int n) 
	{
		ArrayList<Integer>ans=new ArrayList<>();
		for (int i = 0; i < m; i++) 
		{
			ans.add(nums1[i]);
		}
		for (int i = 0; i < n; i++) 
		{
			ans.add(nums2[i]);
		}
		for (int i = 0; i < ans.size(); i++) 
		{
			
		}
    }

}
