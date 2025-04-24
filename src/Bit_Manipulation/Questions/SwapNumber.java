package Bit_Manipulation.Questions;

public class SwapNumber {
    public static void Swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a :"+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        Swap(a,b);


    }
}
