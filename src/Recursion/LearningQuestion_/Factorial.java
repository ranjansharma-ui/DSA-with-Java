package Recursion.LearningQuestion_;

public class Factorial {
    public static int fact(int num){
        //base-case
        if (num == 0 || num == 1) return 1;
        //my work

        //faith on function call
        return  num*fact(num -1);

    }
    public static void main(String[] args) {
        System.out.println(fact(5));

    }
}
