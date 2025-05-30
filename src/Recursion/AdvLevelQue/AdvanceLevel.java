package Recursion.AdvLevelQue;

public class AdvanceLevel {
    public static int tillingProblem(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //self-work
        //vertical
        int fnm1 = tillingProblem(n-1);
//        System.out.println(fnm1);
        //horizontal
        int fnm2 = tillingProblem(n-2);

//        System.out.println(fnm2);
        int totalWays = fnm1+fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(3));
    }
}
