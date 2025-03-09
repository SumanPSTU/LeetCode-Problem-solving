package StringProblem;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        boolean result = v.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("Is palindrome: " + result);
    }

    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    class Solution {
        public boolean isPalindrome(String s) {
            if(s== null || s.isEmpty()) {
                return true;
            }
            char[] chArr = s.toLowerCase().trim().toCharArray();
            int start=0;
            int end = chArr.length-1;
            while(start<end) {
                while(start<chArr.length && (!Character.isAlphabetic(chArr[start]) && !Character.isDigit(chArr[start]))) {
                    start++;
                }
                while( end >-1 && (!Character.isAlphabetic(chArr[end]) && !Character.isDigit(chArr[end]))) {
                    end--;
                }
                if(start<end && chArr[start] != chArr[end]) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
}
