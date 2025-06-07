package Backtracking;

public class PermutationsPrint {
    public static void printPermutation(String str,String t){
        if (str.equals("")){
            System.out.println(t);
            return;

        }
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left + right;
            printPermutation(rem,t+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str,"");


    }
}
