package Math;

import java.util.Scanner;
public class ReverseInteger_7 {
    public static int reverse(int x){
        int num = Math.abs(x);
        int mod = 0;
        int r = 0;
        while (num!=0){
            mod = num%10;
            if (r > (Integer.MAX_VALUE - mod) / 10) {
                return 0;
            }
            r = r*10+mod;
            num/=10;
        }
        return (x<0)?(-r):r;
    }
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        scanner.close();
        System.out.println(reverse(x));
    }
}
