package Sorting_easy;

import java.util.HashMap;

public class Majority_Element {
    // https://leetcode.com/problems/majority-element/
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{12,52,12,70,12,61,12,12,50,72,82,12,11,25,28,43,40,12,12,53,12,12,98,12,12,92,81,2,12,15,40,12,12,9,12,31,12,12,12,12,77,12,12,50,12,12,12,93,41,92,12,12,12,12,12,12,12,12,12,37,48,14,12,70,82,12,80,12,12,12,12,56,30,12,8,12,50,12,20,12,21,97,12,42,12,10,12,38,73,15,9,11,79,12,12,28,51,12,15,12}));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> x= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (x.containsKey(nums[i])) {
                int value=x.get(nums[i]);
                value++;
                x.put(nums[i], value);
            }
            else{
                x.put(nums[i], 1);
            }
        }
        int index=0;
        int max=x.get(x.keySet().toArray()[0]);
        for (int i = 1; i < x.size(); i++) {
            if(x.get(x.keySet().toArray()[i])>max){
                index=i;
                max=x.get(x.keySet().toArray()[i]);
            }
        }
        return (int)x.keySet().toArray()[index];
    }
}
