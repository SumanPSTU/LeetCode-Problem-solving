package ArraysProblem.easy;

import java.util.HashSet;

public class RemoveDuplicates_26 {
    public int removeDuplicates(int[] nums) {
       int count = 0;
       for (int i =0;i<nums.length;i++){
           if ((i<nums.length-1) && (nums[i] == nums[i+1])){
               continue;
           }else {
               nums[count++] = nums[i];
           }
       }
       return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(new RemoveDuplicates_26().removeDuplicates(nums));
    }
}
