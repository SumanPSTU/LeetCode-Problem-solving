package ArraysProblem;

import java.util.Arrays;

public class ProductOfArrayExpectSelf_238 {

    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] ans = new int[nums.length];

        prefix[0] = 1;
        for (int i =1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        suffix[nums.length-1] = 1;
        for (int i = nums.length-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for (int i =0;i<nums.length;i++){
            ans[i] = suffix[i]*prefix[i];
        }
        return ans;

    }
    public static void main(String[] args){
        int[] array = {1,2,3,4};

        int[] arr = productExceptSelf(array);
        System.out.println(Arrays.toString(arr));

    }
}
