package Math;

public class PowOfTwo {
    public static void main(String[] args) {

    }
    public static boolean isPowerOfTwo(int n) {
        if (Math.log(n)/Math.log(2)==Math.pow(2,Math.log(n)/Math.log(2))) return true;
        return false;
    }
}
