package Sorting_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionofTwoArraysII {
    // https://leetcode.com/problems/intersection-of-two-arrays-ii/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
        ;
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> set1=new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (set1.containsKey(nums1[i])) {
                int value=set1.get(nums1[i]);
                value++;
                set1.put(nums1[i], value);
            }
            else{
                set1.put(nums1[i], 1);
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set1.containsKey(nums2[i]) && set1.get(nums2[i])>0) {
                ans.add(nums2[i]);
                int value=set1.get(nums2[i]);
                value--;
                set1.put(nums2[i], value);
            }
        }
        int output[]= new int[ans.size()];
        for (int i = 0; i < output.length; i++) {
            output[i]= ans.get(i);
        }
        return output;
    }
}
