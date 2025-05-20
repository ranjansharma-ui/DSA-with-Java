package Recursion.LearningQuestion_;
/*
   Return the count of digit in a given number n
   n = 5683
   ans = 4
 */
public class CountDigit {
    public static int Count(int num){
        //base case
        if(num >= 0 && num <= 9){
            return 1;
        }
//        System.out.println(num); checking
        return 1+Count(num/10);
    }
    public static void main(String[] args) {
        System.out.println(Count(5683));
    }
}
