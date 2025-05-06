package ArraysProblem.easy;

import java.util.Arrays;

public class BuildArray_1920 {
    public int[] buildArray(int[] nums) {
        int[] array = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
            array[i] = nums[nums[i]];
        }
        return array;

    }

    // try to reduce space complexity
    public  int[] buildArrayOther(int[] nums){
        for (int i= 0;i<nums.length;i++){
            nums[i] = nums[nums[i]];
        }
        return nums;
    }
    public static void main(String[] args){
//        Input: nums = [0,2,1,5,3,4]
//        Output: [0,1,2,4,5,3]

        int[] array = {0,2,1,5,3,4};
        var buildArray = new BuildArray_1920();
        System.out.println(Arrays.toString(buildArray.buildArray(array)));
    }
}
