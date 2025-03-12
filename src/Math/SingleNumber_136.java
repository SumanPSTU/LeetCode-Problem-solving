package Math;

import java.util.HashSet;

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i:nums){
            if (!set.contains(i)){
                set.add(i);
            }else {
                set.remove(i);
            }
        }
       return (int) set.iterator().next();
    }

    public int singleNumberOtherWay(int[] nums){
        int result = 0;
        for (int num:nums) result^=num;
        return result;
    }
}
