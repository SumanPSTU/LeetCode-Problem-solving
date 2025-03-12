package Math;

import java.util.Scanner;
public class ReverseInteger_7 {
    public static int reverse(int x){
       int num = Math.abs(x);
       int r = 0;
       int result = 0;
       while (num!=0){
            r = num%10;
            result = result*10+r;
            if (result> Integer.MAX_VALUE/10 || result<Integer.MIN_VALUE/10) return 0;
            num/=10;
       }
        return (x<0)?-result:result;
    }
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        scanner.close();
        System.out.println(reverse(x));
    }
}
