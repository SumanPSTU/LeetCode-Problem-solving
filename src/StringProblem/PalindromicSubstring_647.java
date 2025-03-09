package StringProblem;

public class PalindromicSubstring_647 {

    public static void main(String[] args) {
        System.out.println(countSubstrings("llo"));
    }
    private static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                if (isPalindrome(s.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
    }
}
