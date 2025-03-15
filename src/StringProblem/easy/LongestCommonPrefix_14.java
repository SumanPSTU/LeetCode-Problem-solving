package StringProblem.easy;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        for (int i =0;i<strs[0].length();i++){
            if (strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                return sb.toString();
            }else {
                sb.append(strs[0].charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(new LongestCommonPrefix_14().longestCommonPrefix(strs));
    }
}
