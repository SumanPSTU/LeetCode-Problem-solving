package Math;

public class AddDigits {
    public static int Add(int num){

        String x  = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < x.length(); i++) {
            sum = x.charAt(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Add(38));
        String x = "StringProblem";
        int y =55;
        String z = String.valueOf(y);
        int a = Integer.valueOf(z);
        System.out.println(a);
        System.out.println(x.charAt(0));
    }
}
