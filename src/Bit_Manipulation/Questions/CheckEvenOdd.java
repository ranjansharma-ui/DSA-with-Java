package Bit_Manipulation.Questions;

public class CheckEvenOdd {
    public static boolean check(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(check(9));

    }
}
