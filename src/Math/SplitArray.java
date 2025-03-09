package Math;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4};
        System.out.println(String.valueOf(isPossibleToSplit(arr)));
    }
    public static boolean isPossibleToSplit(int[] nums){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Arrays.sort(nums);
        for (int i:nums){
            if (!set1.contains(i)){
                set1.add(i);
            }
            if (!set2.contains(i)){
                set2.add(i);
            }
        }
        return set1.size()==set2.size();
    }
}
