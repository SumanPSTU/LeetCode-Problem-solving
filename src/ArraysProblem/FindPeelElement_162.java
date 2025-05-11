package ArraysProblem;

public class FindPeelElement_162 {
    public int findPeakElement(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        if (nums.length == 2){
            if (nums[0]>nums[1]){
                return 0;
            }else {
                return 1;
            }
        }
        for (int i = 1; i <nums.length-2 ; i++) {
            if (nums[i]>nums[i-1] && nums[i]<nums[i+1]){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1,3,5,6,4};

        System.out.println(new FindPeelElement_162().findPeakElement(arr));
    }

}
