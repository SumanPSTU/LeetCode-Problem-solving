package StringProblem;

import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength_2716 {

    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (Character c :s.toCharArray()){
            if (!set.contains(c)){
                set.add(c);
            }
        }
        return set.size();
    }
    public int minimizedStringLengthOther(String s) {
        return (int) s.chars().distinct().count();
    }
    public static int minimizedStringLengthBestApproach(String s){
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)-97] = 1;
        }
        int sum  = 0;
        for (int i :letters){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minimizedStringLengthBestApproach("apple"));
    }

}
