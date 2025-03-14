package StringProblem.medium;

public class LongestPalindromicSubSting_5 {
    public static boolean isPalindrome(String string){
        int left = 0;
        int right = string.length()-1;
        while (left<right){
            if (string.charAt(left) != string.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s){
        String string = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i,j))){
                    if(string.length() < s.substring(i,j).length()){
                        string = s.substring(i,j);
                    }
                }
            }

        }
        return string;
    }

    //another way to solve this problem

    public static void main(String[] args) {
        String string = "wowm";
        System.out.println(isPalindrome(string));
       System.out.println(new LongestPalindromicSubSting_5().longestPalindrome(string));
    }
}