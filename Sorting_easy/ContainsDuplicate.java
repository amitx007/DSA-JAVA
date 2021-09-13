package Sorting_easy;

import java.util.HashSet;

public class ContainsDuplicate {
    // https://leetcode.com/problems/contains-duplicate/
    public static void main(String[] args) {
        System.out.println();
        containsDuplicate(new int [] {1,2,3,4,4});
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> x=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (x.contains(nums[i])) {
                return true;
            }
            x.add(nums[i]);
        }
        return false;

    }
}
