package ArraysProblem.easy;

import java.util.Arrays;

public class MajorityElement_169 {
    public static void main(String[] args){

    }
    //brute force algorithm O(n2) time complexity
    public int majorityElement(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    count++;
                }
            }
            if (count>(nums.length/2)) return nums[i];
            count=1;
        }
        return 0;
    }

    ///  another technique to solve this problem
    public int majorityElementOther(int[] nums){
        Arrays.sort(nums);
        int f = 1,ans = nums[0];
        for (int i =1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                f++;
            }else {
                f=1;
                ans = nums[i];
            }
            if (f>nums.length/2)return ans;
        }
        return 0;
    }
    //morse voting algorithm
    public int majorElement(int[] nums){
        int f = 0;
        int ans =0;
        for (int i = 0;i<nums.length;i++){
            if (f == 0){
                ans = nums[i];
            }
            if (ans==nums[i]){
                f++;
            }else {
                f--;
            }
        }
        return ans;
    }
}
