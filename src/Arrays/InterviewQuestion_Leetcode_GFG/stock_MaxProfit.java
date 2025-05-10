package Arrays.InterviewQuestion_Leetcode_GFG;

public class stock_MaxProfit {
    public static int MaxProfit(int[] prices){
        int n = prices.length;

        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=0; i<n; i++){
            if (buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;

                MaxProfit = Math.max(MaxProfit,profit);
            }
            else{
                // buying first stock through this approach which is firstly initialize Integer.MAXVALUE; and will also detect minimum buying price through the stock or prices arrays
                buyPrice = prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int [] stock = {3,11,2,4,1,5,3};
        System.out.println("Max Profit : "+MaxProfit(stock));

    }
}
