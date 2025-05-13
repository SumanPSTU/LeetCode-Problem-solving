package ArraysProblem.easy;

import java.util.Arrays;
import java.util.Stack;

public class PlusOne_66 {
    public static int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        int c = 0;
        int sum = 0;
        for (int i : digits) {
            sum = sum * 10 + i;
        }
        sum = sum + 1;
        while (sum>0){
            int rem = sum %10;
            stack.push(rem);
            sum /= 10;
            c++;
        }
        int[] array = new int[c];
        for (int i = 0;i<array.length;i++){
            array[i] = stack.pop();
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(plusOne(array)));
    }
}
