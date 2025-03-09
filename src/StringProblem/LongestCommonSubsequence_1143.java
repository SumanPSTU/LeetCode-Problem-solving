package StringProblem;

public class LongestCommonSubsequence_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int truck = 0;
        char[] textArray1 = text1.toCharArray();
        char[] textArray2 = text2.toCharArray();
        int x = text1.length();
        int y = text2.length();
        if (x < y) {
            for (int i = 0; i < x; i++) {
                if (text2.contains(String.valueOf(textArray1[i]))) {
                    truck++;
                }
            }
        } else {
            for (int i = 0; i < y; i++) {
                if (text1.contains(String.valueOf(textArray2[i]))) {
                    truck++;
                }
            }
        }
        return truck;
    }
}
