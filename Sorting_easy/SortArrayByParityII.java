package Sorting_easy;

import java.util.Arrays;

public class SortArrayByParityII {
    // https://leetcode.com/problems/sort-array-by-parity-ii/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{2,3})));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int index=0;
        int output[]=new int[nums.length];
        for (int i = 0; i < output.length && index<output.length;index++) {
            if (nums[index]%2==0) {
                output[i]=nums[index];
                i+=2;
            }
            
        }
        index=0;
        for (int i = 1; i < output.length && index<output.length; index++) {
            if (nums[index]%2!=0) {
                output[i]=nums[index];
                i+=2;
            }
        }
        return output;
    }
}
