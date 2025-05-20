package Recursion.LearningQuestion_;

/*
  current term = previous tern + prev(previous tern)
      3        = 2             +  1

 */
public class Fibonacci_Series {
    public static int fib(int num){
        //base-case
        if(num==0 || num == 1){
            return num;
        }
//        System.out.println(num);
        return fib(num-1) + fib(num-2);
    }
    public static void main(String[] args) {
        for (int i=0; i<= 10; i++){

            System.out.print(fib(i)+" ");
        }
    }
}
