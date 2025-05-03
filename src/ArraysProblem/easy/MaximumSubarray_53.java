package ArraysProblem.easy;

public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int current  = 0;
        int max = Integer.MIN_VALUE;
        for (int i:nums){
            current+=i;
            if (current>max) max =current;
            if (current<0){
                current=0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaximumSubarray_53().maxSubArray(array));
        int[] ar = {-1};
        System.out.println(new MaximumSubarray_53().maxSubArray(ar));
    }
}
