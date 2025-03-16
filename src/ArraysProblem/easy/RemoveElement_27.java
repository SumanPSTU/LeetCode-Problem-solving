package ArraysProblem.easy;

import java.util.Arrays;

public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] array = {3,2,2,3};
        System.out.println(new RemoveElement_27().removeElement(array,3));
    }
}
