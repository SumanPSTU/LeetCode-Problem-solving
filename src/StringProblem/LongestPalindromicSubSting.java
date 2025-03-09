package StringProblem;
public class LongestPalindromicSubSting {
    private static boolean isPalindromic(String str){
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left)!= str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static int longestPalindromicSubstring(String str){
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1;j<=str.length();j++){
                if (isPalindromic(str.substring(i,j))){
                    if (max<str.substring(i,j).length()){
                        max = str.substring(i,j).length();
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(longestPalindromicSubstring("thisisastring"));
    }
}