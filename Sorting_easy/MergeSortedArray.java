package Sorting_easy;

import java.util.Arrays;

public class MergeSortedArray {
    // https://leetcode.com/problems/merge-sorted-array/
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int output[]= new int[m+n];
        for (int i = 0; i < m; i++) {
            output[i]=nums1[i];
        }
        for (int i = m; i <m+n; i++) {
            output[i]=nums2[i-m];   
        }
        System.out.println(Arrays.toString(output));
        for (int i = 0; i < output.length-1; i++) 
		{
			for (int j = i+1; j>0; j--) 
			{
				if (output[j-1]>output[j]) 
				{
					int temp=output[j-1];
					output[j-1]=output[j];
					output[j]=temp;
				}
				else 
				{
					break;
				}
			}
		}
        System.out.println(Arrays.toString(output));
    }
}
