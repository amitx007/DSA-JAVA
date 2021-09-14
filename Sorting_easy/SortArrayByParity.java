package Sorting_easy;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0})));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int output[]= new int[nums.length];
        int index=0;
        for (int i = 0; i < output.length; i++) {
            if (nums[i]%2==0) {
                output[index]=nums[i];
                index++;
            }
        }
        for (int i = 0; i < output.length; i++) {
            if (nums[i]%2!=0) {
                output[index]=nums[i];
                index++;
            }
        }
        return output;
    }
}
