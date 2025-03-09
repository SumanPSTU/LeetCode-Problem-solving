package StringProblem;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = {-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicatesOther(arr));
        System.out.println(removeDuplicates(arr));
        for (int i:arr){
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

    }
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int ele:nums){
            set.add(ele);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int index = 0;
        for (int i:list){
            nums[index++] = i;
        }
        return index;
    }
    public static int removeDuplicatesOther(int[] nums){
        int count = 1;
        for (int i =1;i<nums.length;i++){
            if (nums[i] != nums[i-1]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}