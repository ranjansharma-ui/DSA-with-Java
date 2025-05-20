package Recursion.LearningQuestion_;

public class SumOfDigit {
    //iterative
    public static void SumDig(int num){
        int sum = 0;
        while(num > 0){
            int unitD = num%10;
            sum = sum+unitD;

            num = num/10;
        }
        System.out.println(sum);
    }

    //Recursive
    public static int SumDigRec(int num){
        //base case
        if(num == 0){
            return num;
        }

        return SumDigRec(num/10) + num%10;
    }
    public static void main(String[] args) {
        SumDig(2345);
        System.out.println(SumDigRec(2345));
    }
}
