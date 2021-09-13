package Sorting_easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays {
    // https://leetcode.com/problems/intersection-of-two-arrays/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer> set1=new HashSet<>();
      HashSet<Integer> set2=new HashSet<>();

      for (int i = 0; i < nums1.length; i++) {
          set1.add(nums1[i]);
      }
      for (int i = 0; i < nums2.length; i++) {
          set2.add(nums2[i]);
      }
      int minlenghth=set1.size()>set2.size()?2:1;
      ArrayList<Integer> ans= new ArrayList<>();
      if (minlenghth==2) {
          for (int i = 0; i < set2.size(); i++) {
              if (set1.contains(set2.toArray()[i])) {
                  ans.add((int)set2.toArray()[i]);
              }
          }
      }
      else{
        for (int i = 0; i < set1.size(); i++) {
            if (set2.contains(set1.toArray()[i])) {
                ans.add((int)set1.toArray()[i]);
            }
        }
      }
      int output[]= new int[ans.size()];
      for (int i = 0; i < output.length; i++) {
            output[i]=ans.get(i);
      }
      return output;
    }
   
}
