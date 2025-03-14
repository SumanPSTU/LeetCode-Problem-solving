package Math.Hard;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianOfTwoArray_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] array = new int[nums2.length+nums1.length];

       System.arraycopy(nums1,0,array,0,nums1.length);
       System.arraycopy(nums2,0,array,nums1.length,nums2.length);
       Arrays.sort(array);
        System.out.println(Arrays.toString(array));

       if (array.length%2!=0){
           return (double) array[array.length/2];
       }

       return (double) (array[array.length/2]+array[array.length/2-1])/2;

    }
    public static double backTracking(int[] nums1, int[] nums2){
        int[] array = new int[nums1.length + nums2.length];
        int f = 0, l = 0, t = 0;

// Merge the two arrays while both have elements
        while (f < nums1.length && l < nums2.length) {
            if (nums1[f] < nums2[l]) {
                array[t] = nums1[f];
                f++;
            } else {
                array[t] = nums2[l];
                l++;
            }
            t++;
        }
        while (f < nums1.length) {
            array[t] = nums1[f];
            f++;
            t++;
        }
        while (l < nums2.length) {
            array[t] = nums2[l];
            l++;
            t++;
        }

        System.out.println(Arrays.toString(array));
        if (array.length%2!=0){
            return (double) array[array.length/2];
        }

        return (double) (array[array.length/2]+array[array.length/2-1])/2;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        System.out.println(findMedianSortedArrays(a,b));
        System.out.println(backTracking(a,b));
    }
}
