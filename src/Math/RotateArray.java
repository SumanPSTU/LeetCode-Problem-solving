package Math;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int[] nums ={1,2,3,4,5,6,7};
        r.rotate(nums,5);
        System.out.println(Arrays.toString(nums));
    }
    public void rotate(int[] nums, int k){
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int[]nums, int start , int end){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}