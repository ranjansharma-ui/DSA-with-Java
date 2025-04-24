package Arrays.Questions;
/*
     29. Divide Two Integers                [leetcode]
 */

public class Question_14 {

    public static int EasyDivide(int dividend, int divisor){
        int sum =0,  count = 0;

        while(dividend > sum){
            count++;
            sum = sum+divisor;

        }
        return count;
    }
    public static int Divide(long dividend, int division){
        if (dividend == division) return 1;

        boolean sign = true;

        if(dividend >=0 && division <0){
            sign = false;
        }
        if (dividend<0 && division > 0){
            sign = false;
        }

        long n = Math.abs(dividend);
        long d = Math.abs(division);
        int ans = 0;

        while (n >= d){
            int count = 0;

            while(n>= (d *Math.pow(2,count+1))){
                count++;
            }
            ans += Math.pow(2,count);

            n = n-(d*(1<<count));
        }

        if (dividend >= Math.pow(2,31) && sign == true){
            return Integer.MAX_VALUE;

        }
        if(dividend >= Math.pow(2,31) && sign == false){
            return Integer.MIN_VALUE;
        }

        return sign ? ans : (-1*ans);
    }
    public static void main(String[] args) {
        long ans = Divide(-2147483648,-1); // that is fully obtimal solution
//        long ans = EasyDivide(Integer.MAX_VALUE,3); // hag diya bc [This approach is not handle long size only confort is small size not thinking others thing haa haa!]
        System.out.println(ans);

    }
}
