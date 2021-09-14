package Sorting_easy;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-100,-2,-3,1}));
    }
    public static int maximumProduct(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if (Math.abs(nums[j-1])   >Math.abs(nums[j])) {
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        int counter=1;
        int ans=nums[nums.length-1];
        for (int i = nums.length-2; counter< 3&& i>=0; i--) {
           int out=ans*nums[i];
           if (out>ans) {
               ans=out;
               counter++;
           }
        }
        return ans;
    }
}
