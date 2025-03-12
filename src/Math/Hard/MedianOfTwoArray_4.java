package Math.Hard;

import java.util.Arrays;

public class MedianOfTwoArray_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,array,0,nums1.length);
        System.arraycopy(nums2,0,array,nums1.length,nums2.length);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        if (array.length == 2 ) return (double) (array[0] + array[1])/2;
        if (array.length%2==0){
            return (double)  ((array[array.length/2] + array[(array.length/2)-1]))/2;
        }

        return (double) array[array.length/2];

    }

    public static void main(String[] args) {
        int[] a = {1,4};
        int[] b = {3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
