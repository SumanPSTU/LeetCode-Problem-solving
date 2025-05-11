package ArraysProblem;

public class PeekIndexOfAMountainArray_852 {
    //time complexity O(n)
    public int peakIndexInMountainArrayOther(int[] arr) {
        int left =0;
        int right = arr.length-1;
        while (left<=right){
            if (left==right) return left;
            if (arr[left]<arr[left+1]){
                left++;
            }
            if (arr[right]<arr[right-1]) right--;
        }
        return 0;

    }
    // using binary search time complexity O(log n)
    public int peakIndexInMountainArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid-1]!= arr[mid] && arr[mid+1] != arr[mid] && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if (arr[mid]<arr[mid+1]){
                left = mid+1;
            }else {
                right = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(new PeekIndexOfAMountainArray_852().peakIndexInMountainArray(arr));
        System.out.println(new PeekIndexOfAMountainArray_852().peakIndexInMountainArrayOther(arr));
    }
}
