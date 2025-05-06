package StringProblem.easy;

public class AddString_415 {

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int right1 = num1.length() - 1;
        int right2 = num2.length() - 1;
        int carry = 0;

        while (right1 >= 0 || right2 >= 0 || carry > 0) {
            int x = (right1 >= 0) ? num1.charAt(right1) - '0' : 0;
            int y = (right2 >= 0) ? num2.charAt(right2) - '0' : 0;

            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;

            right1--;
            right2--;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2)); // Expected output: "134"
    }
}
