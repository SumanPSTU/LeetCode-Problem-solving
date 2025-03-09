package ArraysProblem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SuffleArray_1470 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int n = array.length/2;
        System.out.println(Arrays.toString(new SuffleArray_1470().shuffle(array,n)));
    }
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[nums.length];
        for (int i = 0; i < n; i++) {
            array[i*2] = nums[i];
            array[i*2+1] = nums[n+i];
        }
        return array;
    }
}
