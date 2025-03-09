import java.util.Scanner;
import java.math.BigInteger;
public class BinaryAddLeetCode {
    public static void main(String[] args) {
        String s1,s2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first binary number");
        s1 = scanner.nextLine();
        System.out.println("Enter second binary number");
        s2 = scanner.nextLine();
        System.out.println(AddBinary(s1,s2));

    }
    public static String AddBinary(String x, String y){
        BigInteger num1 = new BigInteger(x,2);
        BigInteger num2 = new BigInteger(y,2);
        BigInteger sum = num1.add(num2);

        return sum.toString(2);


    }
}
