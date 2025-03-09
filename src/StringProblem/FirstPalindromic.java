package StringProblem;

public class FirstPalindromic {
    public static void main(String[] args) {

    }
    public String firstPalindrome(String[] words) {
        for (String s:words){
            if (isPalindromic(s)){
                return s;
            }
        }
        return "";
    }
    private static boolean isPalindromic(String s){
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
