package Recursion.LearningQuestion_;

public class Decreasing_order {
    public static void orderprint(int num){
        //base-case
        if(num == 1){
            System.out.print(num);
            return;
        }
        System.out.print(num+" ");
        orderprint(num-1);

    }
    public static void main(String[] args) {
        orderprint(10);

    }
}
