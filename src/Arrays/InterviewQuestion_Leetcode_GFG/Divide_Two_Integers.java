package Arrays.InterviewQuestion_Leetcode_GFG;

public class Divide_Two_Integers {
    public static long Solution(int dividend, int divisor){
        //base case
        if (dividend == divisor){
            return 1;
        }
        boolean sign = true;
        if (dividend >= 0 && divisor < 0) sign = false;
        if (dividend <= 0 && divisor > 0) sign = false;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long ans = 0;

        // A bit of feature engineering method used
        while(n >= d){
            int count = 0;

            while (n >= (d << count+1)){
                count++;
            }

            ans += 1<<count;

            n -= (d << count);

        }

        if (ans == (1<<31) && sign){
            return Integer.MAX_VALUE;
        }
        if (ans == (1<<31) && !sign){
            return Integer.MIN_VALUE;
        }


       return sign ? ans : -ans;
    }
    public static void main(String[] args) {
        System.out.println(Solution(-2147483648,-1));
    }
}
