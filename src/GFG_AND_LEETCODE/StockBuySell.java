package GFG_AND_LEETCODE;

public class StockBuySell {
    public static int Solution(int[]arr){
        int ProfitMax = 0;
        int stock = arr[0];


        for (int i=1; i<arr.length; i++){
            int maxProfit = Integer.MIN_VALUE;

            int profit = arr[i]-stock;
            maxProfit = Math.max(maxProfit,profit);

            if (arr[i] < stock || i == arr.length-1){
                ProfitMax += maxProfit;
                stock = arr[i];
            }
        }

        return ProfitMax;
    }
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(Solution(arr));

    }
}
