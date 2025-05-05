package ArraysProblem.easy;
public class BuySellStock_121 {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices){
            if (minPrice>price){
                minPrice = price;
            }
            int profit = price-minPrice;
            if (maxProfit<profit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] array = {7,1,5,3,6,4};
        System.out.println(maxProfit(array));
        System.out.println(Integer.MAX_VALUE);
    }
}