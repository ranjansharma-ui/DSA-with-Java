package Recursion.intermediate_Level;
/*
  Given a number num ans a value k, print k multiple of num

 */
public class K_multipleNum {
    public static void MultipleNum(int n,int k){
        //base-case
        if(k == 1){
            System.out.println(n);
            return;
        }

        MultipleNum(n,k-1);
        System.out.println(n*k);

    }
    public static void main(String[] args) {
        MultipleNum(12,5);

    }
}
