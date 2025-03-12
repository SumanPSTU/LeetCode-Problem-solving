package Math;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        String s = String.valueOf(x);
        for (int i=0;i<s.length()-1/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber_9 p = new PalindromeNumber_9();
        System.out.println(p.isPalindrome(121));
    }
}
