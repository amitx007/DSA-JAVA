package Sorting_easy;

public class Missing_Number {
    // https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        
    }
    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length;) {
            if (nums[i]==i) {
                i++;
            }
            else{
                if (nums[i]==nums.length) {
                    i++;
                }
                else{
                    int index=nums[i];
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i) {
                return i;
            }
        }
        return nums.length;
    }
}
