package Math.Easy;

public class PowerOfN_50 {
    public  double myPow(double x, int n) {
        int binaryForm = n;
        int ans = 1;
        while (binaryForm > 0) {
            if (binaryForm % 2 == 1) {
                ans *= x;
            }
            x *= x;
            binaryForm /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(new PowerOfN_50().myPow(x,n));

    }
}
