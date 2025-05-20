package Strings.Questions;

public class PalindromeString {
    public static boolean palindrome(String str){
        int n = str.length();

        int st = 0;
        int end = n-1;

        while (st <= end){
            if (str.charAt(st) != str.charAt(end)) return false;
            if (str.charAt(st) == str.charAt(end)){
                st++;
                end--;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String src = "racecar";
        System.out.println(palindrome(src));

    }
}
