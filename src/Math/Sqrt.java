package Math;
import java.util.Scanner;
public class Sqrt {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println(sqrt(x));
    }
    public static int sqrt(int x){
        return (int) Math.floor(Math.sqrt(Math.abs(x)));
    }
}
