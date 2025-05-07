package DSASHEET;

public class Q_08_Buy_sell_Stocks {
    public static int MaxProfit(int [] prices){
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if (buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;

                maxProfit = Math.max(maxProfit,profit);

            }
            else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println("Max profit : "+MaxProfit(arr));

    }
}
