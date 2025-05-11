package ArraysProblem;

import java.security.SecureRandom;
import java.util.HashSet;

public class SingleElement_540 {
    // using hash set it take extra space and tine complexity O(n)
    public int singleNonDuplicateOther(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                set.remove(i);
            }
        }
        return set.iterator().next();
    }

    // using XOR operation
    public int singleNonDuplicateXor(int[] nums) {
        int count = 0;
        for (int n : nums) {
            count ^= n;
        }

        return count;
    }

    // using binary search algorithm and time complexity (log n)
    public static int singleNonDuplicate(int[] nums) {
       int left = 0;
       int right = nums.length-1;
       while (left<=right){
           int mid = left + (right-left)/2;
           if (mid%2!=0){
               mid--;
           }
           if (nums[mid] == nums[mid+1]){
               left = mid + 2;
           }else {
               right = mid -1;
           }
       }
       return nums[left];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] array = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(singleNonDuplicate(array));
        System.out.println(singleNonDuplicate(arr));
        System.out.println(new SingleElement_540().singleNonDuplicate(arr));
    }
}
