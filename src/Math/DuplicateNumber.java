package Math;

import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,7};
        System.out.println(findDuplicateFloydsAlgorithm(arr));
    }
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return nums[i];
            }else {
                set.add(nums[i]);
            }
        }
        return 0;
    }

    //Floyd's Tortoise and Hare algorithm

    public static int findDuplicateFloydsAlgorithm(int[] nums){
        int hare = nums[0];
        int tortoise = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }while (tortoise!=hare);
        hare = nums[0];
        while (tortoise!=hare){
            hare = nums[hare];
            tortoise = nums[tortoise];
        }
        return hare;
    }

}
