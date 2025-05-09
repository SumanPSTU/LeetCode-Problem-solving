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

    public static int[] productExceptSelfOther(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;

        // Prefix product (left side product)
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Suffix product (right side product)
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suffix;  // Multiply with suffix
            suffix *= nums[i];  // Update suffix product
        }

        return ans;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4};

        int[] arr = productExceptSelf(array);
        System.out.println(Arrays.toString(arr));
        int[] ar = productExceptSelfOther(array);
        System.out.println(Arrays.toString(ar));

    }
}
