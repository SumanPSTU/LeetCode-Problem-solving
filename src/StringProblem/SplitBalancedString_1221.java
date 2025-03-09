package StringProblem;

public class SplitBalancedString_1221 {
    public static void main(String[] args) {

    }
    public int balancedStringSplit(String s) {
            int count = 0;
            int balance = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    balance++;
                } else if (s.charAt(i) == 'L') {
                    balance--;
                }
                if (balance == 0) {
                    count++;
                }
            }

            return count;

    }
}
