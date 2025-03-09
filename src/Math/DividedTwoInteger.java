package Math;

public class DividedTwoInteger {
    public static void main(String[] args) {
        DividedTwoInteger d = new DividedTwoInteger();
        System.out.println(d.divide(83648,54));
    }
    public int divide(int dividend, int divisor) {
        int count = 0;
        if (dividend>Integer.MAX_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        int x =Math.abs(dividend);
        int y = Math.abs(divisor);
        while (x >= y) {
            count++;
            x -= y;
        }
        if (dividend<0 && divisor<0){
            return count;
        }
        if ((dividend<0 && divisor>0) ||(dividend>0 && divisor<0)){
            return -count;
        }
        return count;
    }
}
