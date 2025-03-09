package ArraysProblem;

public class RichestCoustomer_1672 {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        int richest = 0;

        for (int i = 0;i<accounts.length;i++){
            int max = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                max +=accounts[i][j];
            }
            if (max>richest){
                richest = max;
            }
        }
        return richest;

    }
}
