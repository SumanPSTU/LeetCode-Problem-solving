package ArraysProblem.hard;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianOfTwoSortedArray_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums2.length + nums1.length];
        int pos =0;
        for (int i=0;i<nums1.length;i++){
            array[pos] = nums1[i];
            pos++;
        }
        for (int i=0;i<nums2.length;i++){
            array[pos] = nums2[i];
            pos++;
        }
        Arrays.sort(array);
        if (array.length % 2 != 0) {
            return array[array.length / 2];
        }
        return (double) (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3};
        int[] ar = {2, 4};
        var v = new MedianOfTwoSortedArray_4().findMedianSortedArrays(arr, ar);
        System.out.println(v);
    }
}
