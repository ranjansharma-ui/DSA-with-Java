package Recursion.intermediate_Level;

import java.util.Scanner;

public class AlternateSigns {
    public static void SeriesSum(int n){
        //base case
        if (n == 0) return;

        //recursive and self-work
        if (n%2 == 0){

             SeriesSum(n-1);
            System.out.print(-n );

        }else {

             SeriesSum(n-1);
            System.out.print("+"+n);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int n = sc.nextInt();
        SeriesSum(n);


    }
}
