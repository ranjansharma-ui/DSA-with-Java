package Bit_Manipulation.Questions;

public class ClearLast {
    public static int ClearLast(int n, int i){
        int bitMask = -1<<i; //or  (~0)<<i
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(ClearLast(15,2));

    }
}
