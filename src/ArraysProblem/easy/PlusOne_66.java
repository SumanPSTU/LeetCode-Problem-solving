package ArraysProblem.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne_66 {
    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i:digits){
            sum = sum*10+i;
        }
        sum=sum+1;
        while (sum>0){
            int rem = sum%10;
            list.add(rem);
            sum/=10;

        }
        Collections.sort(list,Collections.reverseOrder());
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        for (int i =0;i<array.length;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;

        }
        return array;

    }
    public static void main(String[] args){
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(plusOne(array)));
    }
}
