package ArraysProblem;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] array = {1,2};
        int[] array1 = {3,4};
        int[] a ={1,2,3,4};
        System.out.println(a.length/2);
        System.out.println(a[a.length/2]+a[(a.length/2)+1]);
        System.out.println(findMedianSortedArrays(array,array1));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, array, 0, nums1.length);
        System.arraycopy(nums2, 0, array, nums1.length, nums2.length);
        Arrays.sort(array);
        int mid = array.length / 2;
        if (mid % 2 != 0) {
            return (double) array[mid];
        } else {
            return (double) (array[mid - 1] + array[mid]) / 2;
        }

    }

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1 == null || nums1.length == 0) {
                return nums2.length == 1 ? (double) nums2[0] : findMedian(nums2);
            }
            if (nums2 == null || nums2.length == 0) {
                return nums1.length == 1 ? (double) nums1[0] : findMedian(nums1);
            }

            int[] array = new int[nums1.length + nums2.length];
            System.arraycopy(nums1, 0, array, 0, nums1.length);
            System.arraycopy(nums2, 0, array, nums1.length, nums2.length);
            Arrays.sort(array);

            return findMedian(array);
        }

        private double findMedian(int[] array) {
            int mid = array.length / 2;
            if (array.length % 2 != 0) {
                return (double) array[mid];
            } else {
                return (array[mid - 1] + array[mid]) / 2.0;
            }
        }
    }
    class Solution_other {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int totalLength = m + n;
            int midIndex = totalLength / 2;
            boolean isOdd = totalLength % 2 != 0;
            int i = 0, j = 0, current = 0, prev = 0;

            while (i + j <= midIndex) {
                prev = current;

                if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                    current = nums1[i++];
                } else {
                    current = nums2[j++];
                }
            }

            if (isOdd) {
                return current;
            } else {
                return (prev + current) / 2.0;
            }
        }
    }


}
