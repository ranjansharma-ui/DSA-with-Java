package Recursion.intermediate_Level;

public class FriendsPairing {
    public static int friendsPair(int n){
        //base-case
        if(n==1 || n==2){
            return n;
        }

        //choice
        //single
        int fnm1 = friendsPair(n-1);

        //pairs
        int fnm2 = friendsPair(n-2);
        int pairWays = (n-1)*fnm2;

        //totalWays
        int totalWays = fnm1 + pairWays;

        return totalWays;
    }
    public static void main(String[] args) {

        System.out.println(friendsPair(3));

    }
}
