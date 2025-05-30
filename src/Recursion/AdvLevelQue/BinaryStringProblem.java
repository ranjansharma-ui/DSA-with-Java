package Recursion.AdvLevelQue;

public class BinaryStringProblem {
    static void printBinString(String str, int lastPlace, int n){
        //base-case
        if (n==0){
            System.out.println(str);
            return;
        }

        //kaam
        if (lastPlace == 0){
            printBinString(str+"0",0,n-1);
            printBinString(str+"1",1,n-1);

        }else {
            printBinString(str+"0",0,n-1);

        }
    }
    public static void main(String[] args) {
        printBinString("",0,3);

    }
}
