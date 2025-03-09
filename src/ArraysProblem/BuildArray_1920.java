package ArraysProblem;
public class BuildArray_1920 {
    public static void main(String[] args) {
        int[] array = {0,2,1,5,3,4};
    }
    public int[] buildArray(int[] nums) {
        int[] array = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            array[i] = nums[nums[i]];
        }
        return array;
    }
    public int[] buildArrayOther(int[] nums) {
        for (int i = 0;i<nums.length;i++){

        }
        return nums;
    }
}
