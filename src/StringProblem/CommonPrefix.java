package StringProblem;

import java.util.Arrays;

public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";
            Arrays.sort(strs);

            int index = 0;

            while (index < strs[0].length() && index < strs[strs.length-1].length()) {
                if (strs[0].charAt(index) == strs[strs.length-1].charAt(index)) {
                    index++;
                } else {
                    break;
                }
            }
            return index == 0 ? "" : strs[0].substring(0, index);
        }



    public static void main(String[] args) {
        CommonPrefix commonPrefix = new CommonPrefix();
        String  strs[] = {"ab","ab","abc"};

        System.out.println(commonPrefix.longestCommonPrefix(strs));
    }
}
