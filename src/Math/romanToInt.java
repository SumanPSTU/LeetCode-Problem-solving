package Math;

import java.util.HashMap;

public class romanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToInt = new HashMap<Character, Integer>();
        int sum = 0;
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        for (int i = 0; i < s.length()-1; i++) {
            if (romanToInt.get(s.charAt(i))>=romanToInt.get(s.charAt(i+1))){
                sum += romanToInt.get(s.charAt(i));
            }else {
                sum-= romanToInt.get(s.charAt(i));
            }
        }
        sum += romanToInt.get(s.charAt(s.length()-1));
        return sum;

    }

    public static void main(String[] args) {
        String s = "LVIII";
        romanToInt romanToInt = new romanToInt();
        System.out.println(romanToInt.romanToInt(s));
    }

}
