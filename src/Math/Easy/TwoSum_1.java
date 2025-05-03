package Math.Easy;

import java.util.Arrays;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
       for (int i =0;i<nums.length;i++){
           for (int j = i+1; j < nums.length; j++) {
               if (nums[i]+nums[j]==target){
                   return new int[]{i,j};
               }
           }
       }
       return null;
    }
    public static void main(String[] args){
        var two = new TwoSum_1();
        int[] array = {1,2,3,4,5,6,7};
        int target = 11;
        System.out.println(Arrays.toString(two.twoSum(array,target)));
    }
}
