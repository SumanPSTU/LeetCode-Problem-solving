package ArraysProblem.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {

    // brute force approach with time complexity (n2)
    public int[] productExceptSelfOther(int[] nums) {
        int[] array = new int[nums.length];
        int track = 0;
        int pos = 0;
        int m = 1;
        while (track<nums.length){
            for (int i =0;i<nums.length;i++){
                if (track!=i){
                    m*=nums[i];
                }
            }
            array[pos++] = m;
            m=1;
            track++;
        }
        return array;
    }

    //optimal approach for solve this problem
    public int[] productExceptSelfException(int[] nums){
        int mul = 1;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] != 0){
                mul*=nums[i];
            }

        }

        for (int i = 0;i<nums.length;i++){
            nums[i] = mul/nums[i];
        }
        return nums;
    }

    // two pointer approach
    public int[] productExceptSelf(int[] nums){
        return null;
    }



//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]

    public static void main(String[] args){
        int[] array = {1,2,3,4};
        var arr = new ProductOfArrayExceptSelf_238();
        System.out.println(Arrays.toString(arr.productExceptSelfOther(array)));
        System.out.println(Arrays.toString(arr.productExceptSelf(array)));
    }
}
