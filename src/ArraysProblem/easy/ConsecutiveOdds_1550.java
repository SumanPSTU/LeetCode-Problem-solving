package ArraysProblem.easy;

public class ConsecutiveOdds_1550 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i:arr){
            if (i%2!=0){
                count++;
                if (count==3) return true;
            }else {
                count = 0;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,34,3,4,5,7,23,12};

        System.out.println(threeConsecutiveOdds(arr));
    }
}
