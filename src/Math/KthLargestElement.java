package Math;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums ={3, 2, 1, 5, 6, 4,45,90,46};
        System.out.println(findKthLargest(nums,3));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
