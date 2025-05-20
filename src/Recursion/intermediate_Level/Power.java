package Recursion.intermediate_Level;
/*
   Given two number p & q find the value P^q using a recursive
   p^q = p*p*p*p*p*p*p*p*......p -> q times

   => p^q = (p^q-1) * p where (p^q-1)->recursive relation , p->selfWork  (Hint1)


 */
public class Power {
    //first-approach
    public static int pow(int p, int q){
        //base-case
        if (q == 0) return  1;

        //self work and recursive relation
        return pow(p,q-1)*p;
    }
    //second-approach
    public static int pow2(int p, int q){
        int temp = q;
        // base case
        if (q == 0) return 1;

        if (q%2 == 0){
            int smallPow = pow2(p,q/2);
            return smallPow*smallPow;
        }

        int smallpow2 = pow2(p,q/2);
        return smallpow2*smallpow2*p;

    }

    public static void main(String[] args) {
        System.out.println(pow(5,4));
        System.out.println(pow2(5,4));
    }
}
