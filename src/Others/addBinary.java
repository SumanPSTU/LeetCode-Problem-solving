import java.util.Scanner;

public class addBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first binary string:");
        String s1 = scanner.nextLine();

        System.out.println("Enter second binary string:");
        String s2 = scanner.nextLine();
        String result = binaryAdd(s1, s2);
        System.out.println("The sum of the two binary numbers is: " + result);

        scanner.close();
    }

    public static String binaryAdd(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }
}
